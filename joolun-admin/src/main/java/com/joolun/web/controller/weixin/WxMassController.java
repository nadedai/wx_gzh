package com.joolun.web.controller.weixin;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.bean.result.WxMediaUploadResult;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.WxMpMassNews;
import me.chanjar.weixin.mp.bean.WxMpMassOpenIdsMessage;
import me.chanjar.weixin.mp.bean.guide.WxMpGuideMassed;
import me.chanjar.weixin.mp.bean.material.WxMediaImgUploadResult;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.result.WxMpMassSendResult;
import me.chanjar.weixin.mp.builder.outxml.TextBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * @author: hht
 * 2022/5/20 16:52
 */

@Slf4j
@RestController
@RequestMapping("/mass")
@Api(tags = "微信群发")
public class WxMassController {
    @Autowired
    WxMpService wxMpService;
    @ApiOperation(("群发"))
    @GetMapping
    public void mass(){
//        WxMediaUploadResult imagedMediaRes = getWxMediaUploadResult("C:\\Users\\haikan\\Desktop\\temp\\2022-05-20 18-13-14-58.png");
//        WxMediaImgUploadResult imagedMediaRes = wxMpService.getMaterialService().mediaImgUpload(file);
//        String url=imagedMediaRes.getUrl();
//        WxMpMassNews news = new WxMpMassNews();
//        WxMpMassNews.WxMpMassNewsArticle article1 = new WxMpMassNews.WxMpMassNewsArticle();
//        article1.setTitle("标题1");
//        article1.setContent("内容1");
//        article1.setThumbMediaId(uploadMediaRes.getMediaId());
//        news.addArticle(article1);
//        WxMpMassNewsArticle
//        WxMpMassNews.WxMpMassNewsArticle article2 = new WxMpMassNews.WxMpMassNewsArticle();
//        article2.setTitle("标题2");
//        article2.setContent("内容2");
//        article2.setThumbMediaId(uploadMediaRes.getMediaId());
//        article2.setShowCoverPic(true);
//        article2.setAuthor("作者2");
//        article2.setContentSourceUrl("www.baidu.com");
//        article2.setDigest("摘要2");
//        news.addArticle(article2);
//
//        WxMpMassUploadResult massUploadResult = wxMpService.getMassMessageService().massNewsUpload(news);
//
//        WxMpMassOpenIdsMessage massMessage = new WxMpMassOpenIdsMessage();
//        massMessage.setMsgType(WxConsts.MASS_MSG_NEWS);
//        massMessage.setMediaId(uploadResult.getMediaId());
//        massMessage.getToUsers().add(openid);
//
//        WxMpMassSendResult massResult = wxMpService.getMassMessageService().massOpenIdsMessageSend(massMessage);
    }

    private WxMediaUploadResult getWxMediaUploadResult(String path){
        WxMediaUploadResult uploadMediaRes= null;
        try {
            FileInputStream file = new FileInputStream(path);
            uploadMediaRes = wxMpService.getMaterialService().mediaUpload(WxConsts.MediaFileType.IMAGE, "jpg", file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return uploadMediaRes;
    }


}
