
package cn.binarywang.wx.miniapp.api.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaTemplateService;
import cn.binarywang.wx.miniapp.bean.template.WxMaTemplateAddResult;

import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.util.json.WxGsonBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WxMaTemplateServiceImpl implements WxMaTemplateService {
  private WxMaService wxMaService;
  public WxMaTemplateServiceImpl(WxMaService wxMaService){
  public WxMaTemplateServiceImpl(WxMaService wxMaService) {
    this.wxMaService = wxMaService;
  }
 public WxMaTemplateLibraryListResult findTemplateLibraryList(int offset, int cou
    String responseText = this.wxMaService.post(TEMPLATE_LIBRARY_LIST_URL, WxGsonBuilder.create().toJson(params));
    WxError wxError = WxError.fromJson(responseText);
    if(wxError.getErrorCode() == 0){
    if (wxError.getErrorCode() == 0) {
      return WxMaTemplateLibraryListResult.fromJson(responseText);
    }else {
    } else {
      throw new WxErrorException(wxError);
    }
  }
 public WxMaTemplateLibraryGetResult findTemplateLibraryKeywordList(String id) th
    String responseText = this.wxMaService.post(TEMPLATE_LIBRARY_KEYWORD_URL, WxGsonBuilder.create().toJson(params));
    WxError wxError = WxError.fromJson(responseText);
    if(wxError.getErrorCode() == 0){
    if (wxError.getErrorCode() == 0) {
      return WxMaTemplateLibraryGetResult.fromJson(responseText);
    }else {
    } else {
      throw new WxErrorException(wxError);
    }
  }
 public WxMaTemplateAddResult addTemplate(String id, List<Integer> keywordIdList)
    String responseText = this.wxMaService.post(TEMPLATE_ADD_URL, WxGsonBuilder.create().toJson(params));
    WxError wxError = WxError.fromJson(responseText);
    if(wxError.getErrorCode() == 0){
    if (wxError.getErrorCode() == 0) {
      return WxMaTemplateAddResult.fromJson(responseText);
    }else {
    } else {
      throw new WxErrorException(wxError);
    }
  }
 public WxMaTemplateListResult findTemplateList(int offset, int count) throws WxE
    String responseText = this.wxMaService.post(TEMPLATE_LIST_URL, WxGsonBuilder.create().toJson(params));
    WxError wxError = WxError.fromJson(responseText);
    if(wxError.getErrorCode() == 0){
    if (wxError.getErrorCode() == 0) {
      return WxMaTemplateListResult.fromJson(responseText);
    }else {
    } else {
      throw new WxErrorException(wxError);
    }
  }
 public boolean delTemplate(String templateId) throws WxErrorException {
    String responseText = this.wxMaService.post(TEMPLATE_DEL_URL, WxGsonBuilder.create().toJson(params));
    WxError wxError = WxError.fromJson(responseText);
    if(wxError.getErrorCode() == 0){
    if (wxError.getErrorCode() == 0) {
      return true;
    }else {
    } else {
       throw new WxErrorException(wxError);
     }
   }
