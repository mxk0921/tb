package com.taobao.themis.kernel.solution;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.ArrayList;
import java.util.Arrays;
import tb.bbs;
import tb.ges;
import tb.ies;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TMSSolutionType {
    MIX,
    MINIGAME,
    WEB_SINGLE_PAGE,
    WIDGET,
    CLUSTER_WIDGET,
    UNIAPP,
    WEEX;
    
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TMSSolutionType";

    public static TMSSolutionType getType(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("1ed9f1d1", new Object[]{bbsVar});
        }
        String e0 = bbsVar.e0();
        if (TextUtils.isEmpty(e0)) {
            return MIX;
        }
        return getType(ies.g(e0));
    }

    public static /* synthetic */ Object ipc$super(TMSSolutionType tMSSolutionType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/solution/TMSSolutionType");
    }

    public static TMSSolutionType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("d1b42f7", new Object[]{str});
        }
        return (TMSSolutionType) Enum.valueOf(TMSSolutionType.class, str);
    }

    public static TMSSolutionType getType(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("9749bd6e", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        TMSLogger.b(TAG, "uri: " + uri);
        String queryParameter = uri.getQueryParameter("_ariver_appid");
        String queryParameter2 = uri.getQueryParameter("_container_type");
        String queryParameter3 = uri.getQueryParameter("isClusterCanal");
        String queryParameter4 = uri.getQueryParameter("isCanal");
        TMSLogger.b(TAG, "appId: " + queryParameter);
        TMSLogger.b(TAG, "containerType: " + queryParameter2);
        TMSLogger.b(TAG, "isClusterCanal: " + queryParameter3);
        TMSLogger.b(TAG, "isCanal: " + queryParameter4);
        ArrayList arrayList = new ArrayList(Arrays.asList("3000000064426654", "3000000060917022", "3000000074071555", "3000000074598201"));
        if (ges.m(uri)) {
            return UNIAPP;
        }
        if (ges.n(uri.toString())) {
            return WEEX;
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return WEB_SINGLE_PAGE;
        }
        if (TextUtils.equals(queryParameter2, "gm")) {
            return MINIGAME;
        }
        if (arrayList.contains(queryParameter)) {
            return MINIGAME;
        }
        if ("true".equals(queryParameter3)) {
            return CLUSTER_WIDGET;
        }
        if ("true".equals(queryParameter4)) {
            return WIDGET;
        }
        return MIX;
    }
}
