package com.taobao.tao.recommend3.newface.gateway.action;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.newface.gateway.action.NewFaceDataProcessAction;
import java.util.List;
import tb.bqa;
import tb.d90;
import tb.f0b;
import tb.g0b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12659a;
    public final /* synthetic */ f0b b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;
    public final /* synthetic */ d90 e;
    public final /* synthetic */ JSONObject f;
    public final /* synthetic */ NewFaceDataProcessAction g;

    public a(NewFaceDataProcessAction newFaceDataProcessAction, String str, f0b f0bVar, String str2, List list, d90 d90Var, JSONObject jSONObject) {
        this.g = newFaceDataProcessAction;
        this.f12659a = str;
        this.b = f0bVar;
        this.c = str2;
        this.d = list;
        this.e = d90Var;
        this.f = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (TextUtils.equals(this.f12659a, "coldStart")) {
            this.b.c("homePostToUiThread");
            this.b.p("homeUiRefresh", 1);
        }
        this.b.c(this.c);
        if (!TextUtils.equals(this.f12659a, "coldStart") || !g0b.i()) {
            for (NewFaceDataProcessAction.RefreshModel refreshModel : this.d) {
                NewFaceDataProcessAction newFaceDataProcessAction = this.g;
                NewFaceDataProcessAction.c(newFaceDataProcessAction, refreshModel.containerId, NewFaceDataProcessAction.b(newFaceDataProcessAction).u(refreshModel.containerId), refreshModel.dataChangeType, this.e, false, this.f);
            }
            return;
        }
        bqa.d("home", "GlobalTrace", "coldStart already refresh, discard");
    }
}
