package com.taobao.tao.flexbox.layoutmanager.module;

import android.animation.AnimatorSet;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.fkh;
import tb.hfs;
import tb.nwv;
import tb.t2o;
import tb.tfs;
import tb.w7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AnimationModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements hfs.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f12306a;

        public a(d.j jVar) {
            this.f12306a = jVar;
        }

        @Override // tb.hfs.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be8bae45", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("succeed", (Object) Boolean.TRUE);
            d.j jVar = this.f12306a;
            jVar.c.a(jVar, jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements hfs.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f12307a;

        public b(d.j jVar) {
            this.f12307a = jVar;
        }

        @Override // tb.hfs.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be8bae45", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("succeed", (Object) Boolean.TRUE);
            d.j jVar = this.f12307a;
            jVar.c.a(jVar, jSONObject);
        }
    }

    static {
        t2o.a(503317271);
        t2o.a(503316559);
    }

    private static void executeAnimation(d.j jVar, AnimatorSet animatorSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6abfd654", new Object[]{jVar, animatorSet});
        } else if (animatorSet == null || animatorSet.getChildAnimations().isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("succeed", (Object) Boolean.FALSE);
            jVar.c.a(jVar, jSONObject);
        } else {
            animatorSet.start();
        }
    }

    private static void executeLottieAnimation(d.j jVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d85bc283", new Object[]{jVar, new Integer(i), obj});
        } else {
            new fkh(jVar, i, obj).d();
        }
    }

    private static boolean isLottieAnimation(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9547ea82", new Object[]{obj})).booleanValue();
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 0) {
                Object obj2 = list.get(0);
                if (obj2 instanceof Map) {
                    return isLottieType((Map) obj2);
                }
                return false;
            }
        }
        if (obj instanceof Map) {
            return isLottieType((Map) obj);
        }
        return false;
    }

    private static boolean isLottieType(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c37caff", new Object[]{map})).booleanValue();
        }
        return TextUtils.equals(nwv.I(map.get("type"), null), "lottie");
    }

    public static void animate(d.j jVar) {
        AnimatorSet animatorSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a214cb", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            int intValue = jSONObject.getIntValue("target");
            Object obj = jSONObject.get("options");
            if (isLottieAnimation(obj)) {
                executeLottieAnimation(jVar, intValue, obj);
                return;
            }
            try {
                if (obj instanceof JSONArray) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = true;
                    for (int i = 0; i < ((JSONArray) obj).size(); i++) {
                        JSONObject jSONObject2 = ((JSONArray) obj).getJSONObject(i);
                        if (nwv.o(jSONObject2.get("group"), false)) {
                            z = false;
                        }
                        arrayList.add(w7l.e(jVar.f11976a, jVar.c(), intValue, jSONObject2));
                    }
                    animatorSet = hfs.c(jVar.f11976a, intValue, arrayList, z, new hfs.d(new a(jVar)));
                } else {
                    animatorSet = hfs.e(jVar.f11976a, intValue, w7l.e(jVar.f11976a, jVar.c(), intValue, jSONObject.getJSONObject("options")), new hfs.d(new b(jVar)));
                }
            } catch (Exception e) {
                tfs.e("Animation", e.getMessage());
                animatorSet = null;
            }
            executeAnimation(jVar, animatorSet);
        }
    }
}
