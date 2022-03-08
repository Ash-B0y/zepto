package com.zepto.irctc;

import com.zepto.irctc.model.TrainDetails;
import com.zepto.irctc.repository.AdminRepository;
import com.zepto.irctc.service.AdminService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class IrctcApplicationTests {


	@InjectMocks
	AdminService adminService;

	@Mock
	AdminRepository adminRepository;

	@Captor
	ArgumentCaptor<TrainDetails> trainDetailsArgumentCaptor;

	TrainDetails trainDetails;

	@BeforeEach
	public void initTrainDetails(){

		trainDetails=new TrainDetails("A1","A/C sleeper",1,"Chennai Express","Chennai","Coimbatore","Egmore","Coimbatore central",20);

	}
	@Test
	@DisplayName("Checking fetch coaches functionality inside add coaches")
	void fetchCoachesTest() {
		String coachType="A/C Sleeper";
		when(adminRepository.fetchCoaches(coachType,1)).thenReturn(
				Stream.of(
						new TrainDetails("A1","A/C sleeper",1,"Chennai Express","Chennai","Coimbatore","Egmore","Coimbatore central",20),
						new TrainDetails("B1","Non A/C sleeper",1,"Chennai Express","Chennai","Coimbatore","Egmore","Coimbatore central",20)
				).collect(Collectors.toList())
		);

		assertEquals(2,adminRepository.fetchCoaches(coachType,1).size());
	}

	@Test
	@DisplayName("Saving the new coaches added by the admin")
	public void saveCoachesTest() {

		adminRepository.save(trainDetails);
		verify(adminRepository, Mockito.times(1)).save(trainDetailsArgumentCaptor.capture());

	}

}
