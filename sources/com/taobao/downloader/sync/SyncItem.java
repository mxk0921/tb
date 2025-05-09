package com.taobao.downloader.sync;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import tb.mg9;
import tb.onf;
import tb.upl;
import tb.xh4;
import tb.zu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SyncItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String biz;
    public Integer callbackCondition;
    public boolean finish;
    public String md5;
    public String name;
    public Integer network = 4;
    public String path;
    public long size;
    public String url;
    public String version;
    public int when;

    public zu7 convert() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zu7) ipChange.ipc$dispatch("1b91130b", new Object[]{this});
        }
        onf onfVar = new onf(this.url);
        onfVar.c = this.md5;
        onfVar.b = this.size;
        onfVar.d = this.name;
        zu7 zu7Var = new zu7();
        ArrayList arrayList = new ArrayList();
        zu7Var.f33016a = arrayList;
        arrayList.add(onfVar);
        upl uplVar = new upl();
        uplVar.c = this.network.intValue();
        uplVar.f29547a = this.biz;
        uplVar.l = "sync:";
        Integer num = this.callbackCondition;
        if (num != null) {
            uplVar.d = num.intValue();
        } else {
            uplVar.d = 2;
        }
        if (!TextUtils.isEmpty(this.path)) {
            uplVar.g = this.path;
        } else {
            uplVar.g = mg9.d(xh4.f31395a, "sync");
        }
        zu7Var.b = uplVar;
        return zu7Var;
    }
}
