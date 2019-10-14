package com.example.offer.service.impl;

import com.example.offer.mapper.EnterpriseMessageMapper;
import com.example.offer.model.EnterpriseMessage;
import com.example.offer.service.EMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangshen
 * @date 2019/10/12 21:05
 * 主要功能说明：
 */
@Service
public class EMessageServiceImpl implements EMessageService {

    @Autowired
    EnterpriseMessageMapper messageMapper;

    @Override
    public int update(EnterpriseMessage enterpriseMessage) {
        return 0;
    }

    @Override
    public EnterpriseMessage selectUserId(Long userId) {
        return messageMapper.selectUserId(userId);
    }


}
