package com.webchat.service.Impl;

import com.webchat.repository.CoSoRepository;
import com.webchat.service.CoSoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoSoServiceImpl implements CoSoService {
    @Autowired
    private CoSoRepository coSoRepository;

    @Override
    public List<String> listCoSo() {
        return coSoRepository.listCoSo();
    }
}
