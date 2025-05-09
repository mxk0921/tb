package com.taobao.infoflow.core.subservice.biz.dxitemclickservice;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cfc;
import tb.fve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DxItemClickServiceImpl implements IDxItemClickService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DxItemClickServiceImpl";
    private static final int TARGET_URL_LENGTH_THRESHOLD = 2048;
    private List<IDxItemClickService.a> mDxItemClickListenerList;
    private List<IDxItemClickService.OnDxClickNavListener> mOnDxClickNavListenerList;
    private List<IDxItemClickService.b> mTargetUrlParamsCreatorList;

    static {
        t2o.a(486539515);
        t2o.a(488636549);
    }

    private String appendParamsToUrl(Map<String, String> map, String str) throws URISyntaxException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ee5ebcc", new Object[]{this, map, str});
        }
        URI uri = new URI(str);
        Map<String, String> parseExistingParams = parseExistingParams(uri.getQuery());
        parseExistingParams.putAll(map);
        String mapToQueryString = mapToQueryString(parseExistingParams);
        if (TextUtils.isEmpty(mapToQueryString)) {
            fve.e(TAG, "assembleParams == null");
            return str;
        }
        String uri2 = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), mapToQueryString, uri.getFragment()).toString();
        if (!isURLLengthOverThreshold(uri2)) {
            return uri2;
        }
        fve.e(TAG, "url字符超长了，使用原始链接");
        return str;
    }

    private String mapToQueryString(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d47a0c4", new Object[]{this, map});
        }
        if (map.isEmpty()) {
            fve.e(TAG, "需要拼接的参数为空");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            try {
                sb.append(URLEncoder.encode(entry.getKey(), "utf-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(String.valueOf(entry.getValue()), "utf-8"));
            } catch (Exception e) {
                fve.e(TAG, "链接转换出现异常，e:" + e);
            }
        }
        return sb.toString();
    }

    private Map<String, String> parseExistingParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1419418a", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            return hashMap;
        }
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=", 2);
            if (split.length == 2) {
                hashMap.put(split[0], split[1]);
            }
        }
        return hashMap;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void addDxClickNavListener(IDxItemClickService.OnDxClickNavListener onDxClickNavListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba97f3d2", new Object[]{this, onDxClickNavListener});
            return;
        }
        if (this.mOnDxClickNavListenerList == null) {
            this.mOnDxClickNavListenerList = new CopyOnWriteArrayList();
        }
        this.mOnDxClickNavListenerList.add(onDxClickNavListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void addDxItemClickListener(IDxItemClickService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("590cb796", new Object[]{this, aVar});
            return;
        }
        if (this.mDxItemClickListenerList == null) {
            this.mDxItemClickListenerList = new CopyOnWriteArrayList();
        }
        this.mDxItemClickListenerList.add(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void addTargetUrlParamsCreator(IDxItemClickService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a89151", new Object[]{this, bVar});
            return;
        }
        if (this.mTargetUrlParamsCreatorList == null) {
            this.mTargetUrlParamsCreatorList = new CopyOnWriteArrayList();
        }
        this.mTargetUrlParamsCreatorList.add(bVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public String assembleBizParamsToTargetUrl(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c711d35", new Object[]{this, baseSectionModel, baseSubItemModel, str});
        }
        List<IDxItemClickService.b> list = this.mTargetUrlParamsCreatorList;
        if (list == null || list.isEmpty()) {
            fve.e(TAG, "mTargetUrlParamsCreatorList is empty");
            return str;
        }
        try {
            Map<String, String> createAssembleParams = createAssembleParams(baseSectionModel, baseSubItemModel, this.mTargetUrlParamsCreatorList);
            if (!createAssembleParams.isEmpty()) {
                return appendParamsToUrl(createAssembleParams, str);
            }
            fve.e(TAG, "没有需要拼接的参数");
            return str;
        } catch (Exception e) {
            fve.e(TAG, "assembleBizParamsToTargetUrl except: " + e);
            return str;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void click(BaseSectionModel baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1596985", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        List<IDxItemClickService.a> list = this.mDxItemClickListenerList;
        if (!(list == null || list.isEmpty())) {
            for (IDxItemClickService.a aVar : this.mDxItemClickListenerList) {
                aVar.click(baseSectionModel, baseSubItemModel, view);
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        List<IDxItemClickService.a> list = this.mDxItemClickListenerList;
        if (list != null) {
            list.clear();
            this.mDxItemClickListenerList = null;
        }
        List<IDxItemClickService.OnDxClickNavListener> list2 = this.mOnDxClickNavListenerList;
        if (list2 != null) {
            list2.clear();
            this.mOnDxClickNavListenerList = null;
        }
        List<IDxItemClickService.b> list3 = this.mTargetUrlParamsCreatorList;
        if (list3 != null) {
            list3.clear();
            this.mTargetUrlParamsCreatorList = null;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void onNav(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc943dd5", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
            return;
        }
        List<IDxItemClickService.OnDxClickNavListener> list = this.mOnDxClickNavListenerList;
        if (!(list == null || list.isEmpty())) {
            for (IDxItemClickService.OnDxClickNavListener onDxClickNavListener : this.mOnDxClickNavListenerList) {
                onDxClickNavListener.onNav(baseSectionModel, baseSubItemModel, bundle, str);
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void onNavFinished(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad70e197", new Object[]{this, new Boolean(z)});
            return;
        }
        List<IDxItemClickService.OnDxClickNavListener> list = this.mOnDxClickNavListenerList;
        if (!(list == null || list.isEmpty())) {
            for (IDxItemClickService.OnDxClickNavListener onDxClickNavListener : this.mOnDxClickNavListenerList) {
                onDxClickNavListener.onNavFinished(z);
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void removeDxClickNavListener(IDxItemClickService.OnDxClickNavListener onDxClickNavListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03ed335", new Object[]{this, onDxClickNavListener});
            return;
        }
        List<IDxItemClickService.OnDxClickNavListener> list = this.mOnDxClickNavListenerList;
        if (list != null) {
            list.remove(onDxClickNavListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void removeDxItemClickListener(IDxItemClickService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0794a39", new Object[]{this, aVar});
            return;
        }
        List<IDxItemClickService.a> list = this.mDxItemClickListenerList;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void removeTargetUrlParamsCreator(IDxItemClickService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b751a74", new Object[]{this, bVar});
            return;
        }
        List<IDxItemClickService.b> list = this.mTargetUrlParamsCreatorList;
        if (list != null) {
            list.remove(bVar);
        }
    }

    private Map<String, String> createAssembleParams(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, List<IDxItemClickService.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ee25a45f", new Object[]{this, baseSectionModel, baseSubItemModel, list});
        }
        HashMap hashMap = new HashMap(2);
        for (IDxItemClickService.b bVar : list) {
            Map<String, String> a2 = bVar.a(baseSectionModel, baseSubItemModel);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
        }
        return hashMap;
    }

    private boolean isURLLengthOverThreshold(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bbcd221", new Object[]{this, str})).booleanValue();
        }
        try {
            return str.getBytes("utf-8").length > 2048;
        } catch (Exception unused) {
            fve.e(TAG, "无效的URL: " + str);
            return false;
        }
    }
}
