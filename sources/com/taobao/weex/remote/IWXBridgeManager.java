package com.taobao.weex.remote;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXRefreshData;
import com.taobao.weex.dom.CSSShorthand;
import java.util.List;
import java.util.Map;
import tb.nxo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IWXBridgeManager {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum BundType {
        Vue,
        Rax,
        Others;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(BundType bundType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/remote/IWXBridgeManager$BundType");
        }

        public static BundType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BundType) ipChange.ipc$dispatch("55da084d", new Object[]{str});
            }
            return (BundType) Enum.valueOf(BundType.class, str);
        }
    }

    void bindMeasurementToRenderObject(long j);

    Object callModuleMethod(String str, String str2, String str3, JSONArray jSONArray);

    void callback(String str, String str2, Object obj, boolean z);

    void createInstance(String str, nxo nxoVar, Map<String, Object> map, String str2);

    void destroyInstance(String str);

    void fireEventOnNode(String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2);

    long[] getRenderFinishTime(String str);

    void initScriptsFramework(String str);

    void markDirty(String str, String str2, boolean z);

    void onInteractionTimeUpdate(String str);

    void post(Runnable runnable);

    void refreshInstance(String str, WXRefreshData wXRefreshData);

    void registerComponents(List<Map<String, Object>> list);

    void registerModules(Map<String, Object> map);

    void restart();

    void setMargin(String str, String str2, CSSShorthand.EDGE edge, float f);

    void setPadding(String str, String str2, CSSShorthand.EDGE edge, float f);

    void setPosition(String str, String str2, CSSShorthand.EDGE edge, float f);

    void setStyleHeight(String str, String str2, float f);

    void setStyleWidth(String str, String str2, float f);
}
