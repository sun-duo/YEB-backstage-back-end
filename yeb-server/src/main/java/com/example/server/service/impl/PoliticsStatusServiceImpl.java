package com.example.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.server.mapper.PoliticsStatusMapper;
import com.example.server.pojo.PoliticsStatus;
import com.example.server.service.IPoliticsStatusService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cruder
 * @since 2022-03-04
 */
@Service
public class PoliticsStatusServiceImpl extends ServiceImpl<PoliticsStatusMapper, PoliticsStatus> implements IPoliticsStatusService {

}