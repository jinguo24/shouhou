package com.simple.service;

import java.util.*;
import com.github.pagehelper.PageInfo;
import com.simple.annotation.HoldBegin;
import com.simple.annotation.HoldEnd;
import com.simple.domain.po.AnalysisWordData;

public interface AnalysisWordDataService {

	/**
     * 根据实体查询分页列表
     *
     * @param record
     * @param offset
     * @param limit
     * @return
     */
	PageInfo<AnalysisWordData> listAsPage(AnalysisWordData record, Integer pageIndex, Integer pageSize);
	
	/**
     * 根据Id获得实体
     *
     * @param id
     * @return
     */
    AnalysisWordData getById(String id);
    
        /**
     * 保存或更新实体
     *
     * @param record
     */
    void saveOrUpdate(AnalysisWordData record);

    /**
     * 根据Id删除实体
     *
     * @param id
     */
    void deleteById(String id);
    
	
	

	
	
				//@HoldBegin
    PageInfo<AnalysisWordData> caluculateListAsPage(AnalysisWordData record, Integer pageIndex, Integer pageSize);
	//@HoldEnd


	
}
