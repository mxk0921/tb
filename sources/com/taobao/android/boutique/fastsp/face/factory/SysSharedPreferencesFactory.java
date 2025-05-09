package com.taobao.android.boutique.fastsp.face.factory;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SysSharedPreferencesFactory implements SharedPreferencesFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(409993228);
        t2o.a(409993227);
    }

    @Override // com.taobao.android.boutique.fastsp.face.factory.SharedPreferencesFactory
    public SharedPreferences create(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("11676488", new Object[]{this, context, str, new Integer(i)});
        }
        return context.getSharedPreferences(str, i);
    }
}
