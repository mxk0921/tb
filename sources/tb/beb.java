package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface beb {
    void b(ux9 ux9Var, qt9 qt9Var);

    void c();

    void d(ux9 ux9Var, Context context, Map<String, String> map, String str, String str2);

    void e(ux9 ux9Var, yac yacVar, Context context, LiveItem liveItem, String str, String str2);

    void f(ux9 ux9Var, Context context, String str, String str2, long j, long j2, long j3, l8d l8dVar);

    void g(ux9 ux9Var, String str, Object obj);

    void h(ux9 ux9Var, Activity activity, LiveItem liveItem, String str, Map<String, String> map);

    boolean i(ux9 ux9Var, LiveItem liveItem);

    void j(ux9 ux9Var, LiveItem liveItem);

    void k(ux9 ux9Var, JSONObject jSONObject, boolean z);

    void l();

    boolean m(ux9 ux9Var, String str);

    void n(ux9 ux9Var, Context context, String str, String str2, JSONObject jSONObject);

    void o(ux9 ux9Var, Context context, String str, Map<String, Object> map);

    void p(ux9 ux9Var, Context context, String str, long j, long j2, l8d l8dVar);

    void q(ux9 ux9Var, Context context, int i, LiveItem liveItem, Map<String, String> map);
}
