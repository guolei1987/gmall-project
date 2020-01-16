package com.guo.gmall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guo.gmall.oms.entity.OrderOperateHistory;
import com.guo.gmall.oms.mapper.OrderOperateHistoryMapper;
import com.guo.gmall.oms.service.OrderOperateHistoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单操作历史记录 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-15
 */
@Service
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistory> implements OrderOperateHistoryService {

}
