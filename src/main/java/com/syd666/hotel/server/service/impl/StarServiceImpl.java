package com.syd666.hotel.server.service.impl;

import com.syd666.hotel.api.entity.Star;
import com.syd666.hotel.server.dao.StarDao;
import com.syd666.hotel.server.service.StarService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 酒店星级表 服务实现类
 * </p>
 *
 * @author Huang Shiwu
 * @since 2019-02-25
 */
@Service
public class StarServiceImpl extends ServiceImpl<StarDao, Star> implements StarService {

}
