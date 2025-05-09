package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, gto> f27768a = new HashMap();

    static {
        t2o.a(962593338);
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6732aca6", new Object[]{this, map});
        } else if (map != null) {
            map.remove("spm");
            map.remove("spm-cnt");
            map.remove("spm-url");
            map.remove("spm-pre");
            map.remove("utparam-cnt");
            map.remove(z9u.KEY_UTPARAM_URL);
            map.remove("utparam-pre");
        }
    }

    public void beginScene(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71cfe214", new Object[]{this, str, map, map2});
            return;
        }
        nhh.f("UTSceneTracker", "beginScene", str, wua.KEY_PROPERTIES, map, "propertiesRule", map2);
        if (!TextUtils.isEmpty(str)) {
            if (((HashMap) this.f27768a).containsKey(str)) {
                nhh.v("UTSceneTracker", "repeat beginScene", str);
                return;
            }
            ((HashMap) this.f27768a).put(str, new gto(str, map, map2));
            p3v.getInstance().beginScene(str, map);
        }
    }

    public Map<String, String> endScene(String str) {
        Map<String, String> sceneProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c22c46f7", new Object[]{this, str});
        }
        nhh.f("UTSceneTracker", "endScene", str);
        HashMap hashMap = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        gto gtoVar = (gto) ((HashMap) this.f27768a).get(str);
        if (!(gtoVar == null || (sceneProperties = gtoVar.getSceneProperties()) == null || sceneProperties.size() <= 0)) {
            hashMap = new HashMap(sceneProperties);
        }
        ((HashMap) this.f27768a).remove(str);
        p3v.getInstance().endScene(str, hashMap);
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str);
        uTHitBuilders$UTCustomHitBuilder.setEventPage("UT_Scene");
        uTHitBuilders$UTCustomHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        return hashMap;
    }

    public Map<String, String> eventDispatch(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b9f731f", new Object[]{this, map});
        }
        Map<String, gto> map2 = this.f27768a;
        if (map2 == null || ((HashMap) map2).size() < 1 || map == null || map.size() < 1) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((HashMap) this.f27768a).entrySet()) {
            gto gtoVar = (gto) entry.getValue();
            if (gtoVar != null) {
                gtoVar.updatePropertiesByRule(map);
                Map<String, String> sceneProperties = gtoVar.getSceneProperties();
                if (sceneProperties != null) {
                    hashMap.putAll(sceneProperties);
                }
            }
        }
        return hashMap;
    }

    public void updateScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9272571", new Object[]{this, str, map});
            return;
        }
        nhh.f("UTSceneTracker", "updateScene", str, wua.KEY_PROPERTIES, map);
        if (!TextUtils.isEmpty(str)) {
            if (!((HashMap) this.f27768a).containsKey(str)) {
                nhh.v("UTSceneTracker", "need beginScene", str);
                return;
            }
            gto gtoVar = (gto) ((HashMap) this.f27768a).get(str);
            if (gtoVar != null) {
                gtoVar.updateProperties(map);
                p3v.getInstance().updateScene(str, map);
            }
        }
    }

    public void updateTmpScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6f15f6", new Object[]{this, str, map});
            return;
        }
        nhh.f("UTSceneTracker", "updateTmpScene", str, "tmpProperties", map);
        if (!TextUtils.isEmpty(str)) {
            if (!((HashMap) this.f27768a).containsKey(str)) {
                nhh.v("UTSceneTracker", "need beginScene", str);
                return;
            }
            gto gtoVar = (gto) ((HashMap) this.f27768a).get(str);
            if (gtoVar != null) {
                a(map);
                gtoVar.updateTmpProperties(map);
            }
        }
    }

    public void beginScene(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e70ef1", new Object[]{this, str, map, map2, map3});
            return;
        }
        nhh.f("UTSceneTracker", "beginScene", str, wua.KEY_PROPERTIES, map, "propertiesRule", map2, "tmpProperties", map3);
        if (!TextUtils.isEmpty(str)) {
            if (((HashMap) this.f27768a).containsKey(str)) {
                nhh.v("UTSceneTracker", "repeat beginScene", str);
                return;
            }
            a(map3);
            gto gtoVar = new gto(str, map, map2);
            gtoVar.updateTmpProperties(map3);
            ((HashMap) this.f27768a).put(str, gtoVar);
            p3v.getInstance().beginScene(str, map);
        }
    }
}
