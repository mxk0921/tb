package com.taobao.search.searchdoor.searchbar.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateCellBean;
import java.util.HashMap;
import java.util.Map;
import tb.am1;
import tb.qrl;
import tb.t2o;
import tb.zl1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchBarHintBean {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MULTI_HINT_SPLITTER = " \\| ";
    public String aac;
    public String atmosImg;
    public String darkAtmosImg;
    public ActivateCellBean discovery;
    public String displayText;
    public HashMap<String, String> extraParams;
    public int iconHeight;
    public String iconName;
    public String iconUrl;
    public int iconWidth;
    public String[] multiDisplayText;
    public String[] multiSearchText;
    public String searchText;
    public String suggestRn;
    public Map<String, String> utParams;
    public String voiceColor;
    public String voiceMask;
    public String voiceText;
    public boolean hasRefresh = false;
    public SearchBarHintADBean advInfo = null;
    public SearchBarHintStructuredBean structuredInfo = null;

    static {
        t2o.a(815793075);
    }

    public String getAtmosImg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fdfb92e", new Object[]{this, new Boolean(z)});
        }
        if (!z || TextUtils.isEmpty(this.darkAtmosImg)) {
            return this.atmosImg;
        }
        return this.darkAtmosImg;
    }

    public void handleMultiHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e5ba9f", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.displayText) && this.displayText.contains(" | ")) {
            String[] split = this.displayText.split(MULTI_HINT_SPLITTER);
            this.displayText = split[0];
            this.multiDisplayText = split;
        }
        if (!TextUtils.isEmpty(this.searchText) && this.searchText.contains(" | ")) {
            String[] split2 = this.searchText.split(MULTI_HINT_SPLITTER);
            this.searchText = split2[0];
            this.multiSearchText = split2;
            if (this.multiDisplayText == null) {
                this.multiDisplayText = split2;
            }
        }
    }

    public boolean isAdvHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86c7dddb", new Object[]{this})).booleanValue();
        }
        if (this.advInfo != null) {
            return true;
        }
        return false;
    }

    public boolean isStructuredHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("673d5ecd", new Object[]{this})).booleanValue();
        }
        SearchBarHintStructuredBean searchBarHintStructuredBean = this.structuredInfo;
        if (searchBarHintStructuredBean == null || searchBarHintStructuredBean.getInfoList() == null || this.structuredInfo.getInfoList().isEmpty()) {
            return false;
        }
        return true;
    }

    public void updateHint(am1 am1Var) {
        zl1 zl1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4e0ceb", new Object[]{this, am1Var});
        } else if (am1Var != null && am1Var.a() != null && !am1Var.a().isEmpty() && (zl1Var = am1Var.a().get(0)) != null && !TextUtils.isEmpty(zl1Var.a())) {
            this.displayText = zl1Var.a();
            this.searchText = zl1Var.e();
            this.extraParams = new HashMap<>(zl1Var.f());
            this.suggestRn = am1Var.b();
            this.iconUrl = zl1Var.c();
            this.iconWidth = qrl.e(zl1Var.d(), 0);
            this.iconHeight = qrl.e(zl1Var.b(), 0);
            this.advInfo = null;
            this.structuredInfo = null;
            this.utParams = null;
            this.hasRefresh = true;
        }
    }
}
