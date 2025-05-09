package com.taobao.alimama.click.cpc;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.munion.taosdk.MunionUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.zv4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CpcClickBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> mArgsMap = new HashMap();
    private String mEurl;
    private boolean mIsFromDisk;

    static {
        t2o.a(1017118731);
    }

    public CpcClickBuilder(String str) {
        this.mEurl = str;
    }

    private void autoCompleteArg() {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11990eb5", new Object[]{this});
            return;
        }
        if (TextUtils.isEmpty(this.mArgsMap.get("epid"))) {
            String str = this.mArgsMap.get("aurl");
            if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && parse.isHierarchical()) {
                String queryParameter = parse.getQueryParameter("epid");
                if (!TextUtils.isEmpty(queryParameter)) {
                    withArgPid(queryParameter);
                }
            }
        }
        try {
            String str2 = this.mEurl;
            if (str2 != null) {
                Uri parse2 = Uri.parse(str2);
                if (parse2.isHierarchical()) {
                    if (TextUtils.isEmpty(this.mArgsMap.get("eadt"))) {
                        withArgEadt(parse2.getQueryParameter("eadt"));
                    }
                    String queryParameter2 = parse2.getQueryParameter("mmAdArgs");
                    String host = parse2.getHost();
                    String path = parse2.getPath();
                    withArg("mmAdArgs", queryParameter2);
                    withArg("host", host);
                    withArg("path", path);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a70abe22", new Object[]{this});
        }
        autoCompleteArg();
        return new zv4(this.mEurl, this.mArgsMap, this.mIsFromDisk).j();
    }

    public String commitAndAppendClickid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57ce3726", new Object[]{this, str});
        }
        return MunionUrlBuilder.appendClickidToTargetUrl(str, commit());
    }

    public CpcClickBuilder isFromDisk(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("656844dc", new Object[]{this, new Boolean(z)});
        }
        this.mIsFromDisk = z;
        return this;
    }

    public CpcClickBuilder withArg(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("2afcd98d", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mArgsMap.put(str, str2);
        }
        return this;
    }

    public CpcClickBuilder withArgAUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("72f16ca9", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put("aurl", str);
        }
        return this;
    }

    public CpcClickBuilder withArgEadt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("5b1ecb0b", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put("eadt", str);
        }
        return this;
    }

    public CpcClickBuilder withArgIsOpenPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("a6894fbe", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            this.mArgsMap.put("isOpenPage", "true");
        }
        return this;
    }

    public CpcClickBuilder withArgPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("37bbc0ec", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put("epid", str);
        }
        return this;
    }

    public CpcClickBuilder withArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("b2d1dcdd", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.mArgsMap.putAll(map);
        }
        return this;
    }
}
