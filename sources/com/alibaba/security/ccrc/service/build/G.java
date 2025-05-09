package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.wukong.plugin.BaseWukongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class G {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2554a = "NativePluginCreateManager";
    public static final String b = "wukong/plugin";
    public volatile boolean d = false;
    public List<BaseWukongContentRiskPlugin> c = new ArrayList();

    public List<? extends BaseWukongContentRiskPlugin> a(Context context) {
        if (this.d) {
            return this.c;
        }
        Map<String, Class<?>> b2 = b(context);
        if (b2 == null || b2.isEmpty()) {
            return this.c;
        }
        for (Class<?> cls : b2.values()) {
            try {
                Object newInstance = cls.getConstructor(Context.class).newInstance(context);
                if (newInstance instanceof BaseWukongContentRiskPlugin) {
                    this.c.add((BaseWukongContentRiskPlugin) newInstance);
                }
            } catch (Throwable th) {
                Logging.e(f2554a, "constructInstance fail", th);
            }
        }
        this.d = true;
        return this.c;
    }

    private Map<String, Class<?>> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7c4b7f4", new Object[]{this, context});
        }
        HashMap hashMap = new HashMap();
        try {
            String[] list = context.getAssets().list(b);
            if (!(list == null || list.length == 0)) {
                for (String str : list) {
                    if (!TextUtils.isEmpty(str) && !hashMap.containsKey(str)) {
                        Class<?> cls = Class.forName(str);
                        if (BaseWukongContentRiskPlugin.class.isAssignableFrom(cls)) {
                            hashMap.put(str, cls);
                        }
                    }
                }
                return hashMap;
            }
            return null;
        } catch (Throwable th) {
            Logging.e(f2554a, "doLoadPlugin fail", th);
            return null;
        }
    }
}
