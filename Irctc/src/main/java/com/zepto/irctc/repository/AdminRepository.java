package com.zepto.irctc.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zepto.irctc.model.TrainDetails;
import com.zepto.irctc.model.TrainDetailsCompositeKeys;



@Repository
public interface AdminRepository extends JpaRepository<TrainDetails, TrainDetailsCompositeKeys>{
	
	@Query("select t from TrainDetails t where t.coachType=:coachType and t.trainId=:trainId")
	List<TrainDetails> fetchCoaches(@Param("coachType") String coachType,@Param("trainId") int trainId);

}
