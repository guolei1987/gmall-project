package com.guo.gmall.pms.service.impl;

import com.guo.gmall.pms.entity.ProductFullReduction;
import com.guo.gmall.pms.mapper.ProductFullReductionMapper;
import com.guo.gmall.pms.service.ProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-15
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}
