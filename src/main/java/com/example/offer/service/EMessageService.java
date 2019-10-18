package com.example.offer.service;

import com.example.offer.model.EnterpriseMessage;

import java.util.List;

/**
 * @author wangshen
 * @date 2019/10/12 17:36
 * 主要功能说明：处理
 */
public interface EMessageService {

    int update(EnterpriseMessage enterpriseMessage);

    EnterpriseMessage selectUserId(Long userId);

    List<EnterpriseMessage> findAllEnterp();
}
