package com.taobao.alimama.click.extend.cpm;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.click.extend.ExtendClickLink;
import com.taobao.munion.taosdk.MunionUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.hs8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ExtendCpmClickBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> mArgsMap = new HashMap();
    private String mEurl;
    private ExtendClickLink mExtendClickLink;

    static {
        t2o.a(1017118756);
    }

    public ExtendCpmClickBuilder(String str) {
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
                    String queryParameter2 = parse2.getQueryParameter("a48");
                    String queryParameter3 = parse2.getQueryParameter("mmAdArgs");
                    String host = parse2.getHost();
                    String path = parse2.getPath();
                    withArg("a48", queryParameter2);
                    withArg("mmAdArgs", queryParameter3);
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
        return new hs8(this.mEurl, this.mArgsMap, this.mExtendClickLink).h();
    }

    public String commitAndAppendClickid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57ce3726", new Object[]{this, str});
        }
        return MunionUrlBuilder.appendClickidToTargetUrl(str, commit());
    }

    public ExtendCpmClickBuilder withArg(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtendCpmClickBuilder) ipChange.ipc$dispatch("52ca0584", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mArgsMap.put(str, str2);
        }
        return this;
    }

    public ExtendCpmClickBuilder withArgAUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtendCpmClickBuilder) ipChange.ipc$dispatch("a65e5fe8", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put("aurl", str);
        }
        return this;
    }

    public ExtendCpmClickBuilder withArgEadt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtendCpmClickBuilder) ipChange.ipc$dispatch("1640f0c6", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put("eadt", str);
        }
        return this;
    }

    public ExtendCpmClickBuilder withArgIsOpenPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtendCpmClickBuilder) ipChange.ipc$dispatch("7120e6f3", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            this.mArgsMap.put("isOpenPage", "true");
        }
        return this;
    }

    public ExtendCpmClickBuilder withArgPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtendCpmClickBuilder) ipChange.ipc$dispatch("5d085085", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put("epid", str);
        }
        return this;
    }

    public ExtendCpmClickBuilder withArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtendCpmClickBuilder) ipChange.ipc$dispatch("1bc0e434", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.mArgsMap.putAll(map);
        }
        return this;
    }

    public ExtendCpmClickBuilder withExtendLink(ExtendClickLink extendClickLink) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtendCpmClickBuilder) ipChange.ipc$dispatch("59865ba3", new Object[]{this, extendClickLink});
        }
        this.mExtendClickLink = extendClickLink;
        return this;
    }
}
