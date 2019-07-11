package com.simple.mapper;

import java.util.*;
import com.simple.common.crud.CommonMapper;
import org.apache.ibatis.annotations.Param;
import com.simple.annotation.HoldBegin;
import com.simple.annotation.HoldEnd;
import com.simple.domain.po.AnalysisWordData;

public interface AnalysisWordDataMapper extends CommonMapper<AnalysisWordData, String> {

	List<AnalysisWordData> findList(AnalysisWordData analysisWordData);
	
	

	
	
				//@HoldBegin
	PageInfo<AnalysisWordData> caluculateList(AnalysisWordData analysisWordData);
	//@HoldEnd


}
