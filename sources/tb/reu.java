package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class reu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MATCH_TAG = "element_matched";
    public static final String TRANSITION = "transition";
    public static final String TRANSITION_ARG_CARD = "card";
    public static final String TRANSITION_ARG_DIRECTION = "direction";
    public static final String TRANSITION_TYPE_CORNER_RADIUS = "cornerradius";
    public static final String TRANSITION_TYPE_FADE = "fade";
    public static final String TRANSITION_TYPE_INTERACT = "interact";
    public static final String TRANSITION_TYPE_PUSH = "push";
    public static final String TRANSITION_TYPE_SCALE = "scale";
    public static final String TRANSITION_TYPE_SECONDPAGE = "secondpage";
    public static final String TRANSITION_TYPE_SHARE = "share";

    /* renamed from: a  reason: collision with root package name */
    public String[] f27323a;
    public String[] b;
    public TimeInterpolator c;
    public long d = 200;
    public List e;
    public Map f;
    public boolean g;

    static {
        t2o.a(503316971);
    }

    public static void a(reu reuVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee2d4f1", new Object[]{reuVar, map});
            return;
        }
        Map map2 = reuVar.f;
        if (map2 != null) {
            map2.putAll(map);
        } else if (map != null) {
            reuVar.f = map;
        }
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("509c253d", new Object[]{context})).booleanValue();
        }
        IDeviceInfo i = od0.D().i();
        if (i != null && i.i()) {
            return false;
        }
        if ((context instanceof aaj) && od0.D().f() != null && od0.D().f().a() == null) {
            return true;
        }
        fhb f = od0.D().f();
        if (f == null || !f.H()) {
            return false;
        }
        return true;
    }

    public static reu m(Context context, Uri uri, Uri uri2, Bundle bundle, boolean z) {
        String[] split;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (reu) ipChange.ipc$dispatch("53296e30", new Object[]{context, uri, uri2, bundle, new Boolean(z)});
        }
        reu reuVar = new reu();
        if (akt.m2()) {
            String[] strArr = {"push"};
            reuVar.b = strArr;
            reuVar.f27323a = strArr;
        } else {
            String queryParameter = uri.getQueryParameter("transition");
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            if (bundle != null ? nwv.o(bundle.get("animated"), true) : true) {
                if (TextUtils.equals(gl4.GESTURE_PULLRIGHTEXIT, uri2.getQueryParameter(gl4.CONFIG_PAN_GESTURE))) {
                    hashSet2.add("push");
                    hashSet2.add("interact");
                }
                if (nwv.o(uri2.getQueryParameter(gl4.CONFIG_SEC_PAGE_ENABLE), false)) {
                    hashSet.add(TRANSITION_TYPE_SECONDPAGE);
                }
                if (!TextUtils.isEmpty(queryParameter)) {
                    try {
                        JSONObject parseObject = JSON.parseObject(queryParameter);
                        queryParameter = parseObject.getString("transitionType");
                        if (parseObject.containsKey("type")) {
                            reuVar.c = hfs.k(nwv.I(parseObject.get("type"), Constants.TimeFunction.EASE));
                        }
                        reuVar.d = nwv.t(parseObject.get("duration"), 200);
                        nwv.t(parseObject.get("delay"), 0);
                        reuVar.e = parseObject.getJSONArray("share");
                        a(reuVar, parseObject);
                    } catch (Exception unused) {
                    }
                    if (!TextUtils.isEmpty(queryParameter) && (split = queryParameter.split(",")) != null && split.length > 0) {
                        String[] split2 = split[0].split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                        int length = split2.length;
                        int i2 = 0;
                        while (i2 < length) {
                            String str = split2[i2];
                            if (TextUtils.equals(str, "share")) {
                                Map map = reuVar.f;
                                length = length;
                                boolean z2 = (map == null || map.get("card") == null || !e(context)) ? false : true;
                                if (akt.F() && z2) {
                                    i = 1;
                                    reuVar.g = true;
                                    hashSet.add(TRANSITION_TYPE_FADE);
                                    hashSet.add(str);
                                    i2 += i;
                                }
                            } else {
                                length = length;
                            }
                            i = 1;
                            hashSet.add(str);
                            i2 += i;
                        }
                        if (split.length > 1) {
                            for (String str2 : split[1].split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
                                hashSet2.add(str2);
                            }
                        } else {
                            for (String str3 : split2) {
                                hashSet2.add(str3);
                            }
                        }
                    }
                } else if (z) {
                    hashSet.add(TRANSITION_TYPE_FADE);
                    hashSet.add("share");
                } else {
                    hashSet.add("push");
                    hashSet2.add("push");
                }
            } else if (z) {
                hashSet.add(TRANSITION_TYPE_FADE);
                hashSet.add("share");
            }
            if (bundle != null) {
                float R = s6o.R(o.J(), nwv.r(bundle.get(gl4.CONFIG_START_CORNER_RADIUS), 0));
                float R2 = s6o.R(o.J(), nwv.r(bundle.get(gl4.CONFIG_END_CORNER_RADIUS), 0));
                if (R > 0.0f || R2 > 0.0f) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(gl4.CONFIG_START_CORNER_RADIUS, Float.valueOf(R));
                    hashMap.put(gl4.CONFIG_END_CORNER_RADIUS, Float.valueOf(R2));
                    a(reuVar, hashMap);
                    hashSet.add(TRANSITION_TYPE_CORNER_RADIUS);
                    hashSet2.add(TRANSITION_TYPE_CORNER_RADIUS);
                    hashSet2.add("share");
                }
            }
            if (nwv.o(uri2.getQueryParameter(gl4.CONFIG_PULL_DOWN), false)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("direction", "bottom");
                a(reuVar, hashMap2);
                hashSet2.add("push");
                hashSet2.add("interact");
            }
            reuVar.f27323a = (String[]) hashSet.toArray(new String[hashSet.size()]);
            reuVar.b = (String[]) hashSet2.toArray(new String[hashSet2.size()]);
        }
        if (reuVar.c == null) {
            reuVar.c = new AccelerateDecelerateInterpolator();
        }
        return reuVar;
    }

    public static Pair<Map, List> n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ea925fa2", new Object[]{context, str});
        }
        String queryParameter = Uri.parse(str).getQueryParameter("transition");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                JSONObject parseObject = JSON.parseObject(queryParameter);
                JSONArray jSONArray = parseObject.getJSONArray("share");
                if (!e(context)) {
                    return new Pair<>(null, jSONArray);
                }
                return new Pair<>(parseObject.getJSONObject("card"), jSONArray);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99fd51c7", new Object[]{this, strArr, str})).booleanValue();
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27412b45", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public String j() {
        Map z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a52121f", new Object[]{this});
        }
        List list = this.e;
        if (!(list == null || list.isEmpty() || (z = nwv.z(this.e.get(0), null)) == null)) {
            for (Map.Entry entry : z.entrySet()) {
                if (!((String) entry.getKey()).equals(MATCH_TAG)) {
                    return (String) entry.getValue();
                }
            }
        }
        return null;
    }

    public boolean k(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb6a9f89", new Object[]{this, strArr})).booleanValue();
        }
        if (this.f27323a == null) {
            return false;
        }
        for (String str : strArr) {
            if (!b(this.f27323a, str)) {
                return false;
            }
        }
        return true;
    }

    public boolean l(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47b0084f", new Object[]{this, strArr})).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        for (String str : strArr) {
            if (!b(this.b, str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.transition.Transition] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.transition.Fade] */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.transition.TransitionSet] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.taobao.tao.flexbox.layoutmanager.animation.shareelement.AbsContainerTransition] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.taobao.tao.flexbox.layoutmanager.animation.shareelement.CornerRadiusTransition] */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.taobao.tao.flexbox.layoutmanager.animation.shareelement.CornerRadiusTransition] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.transition.Transition d(android.content.Context r10, java.lang.String r11, tb.reu r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.reu.d(android.content.Context, java.lang.String, tb.reu, boolean):android.transition.Transition");
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0cdd2b5", new Object[]{this})).booleanValue();
        }
        Map map = this.f;
        return l("push", "interact") && (map != null ? TextUtils.equals("bottom", nwv.I(map.get("direction"), "right")) : false);
    }

    public boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76b840a3", new Object[]{this, context})).booleanValue();
        }
        Map map = this.f;
        return l("share", "interact") && (map != null && map.get("card") != null && e(context));
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18267236", new Object[]{this})).booleanValue();
        }
        Map map = this.f;
        return akt.e2() && l("push", "interact") && (map != null ? TextUtils.equals("right", nwv.I(map.get("direction"), "right")) : true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void o(Activity activity, reu reuVar, boolean z) {
        String str;
        char c;
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361af1c7", new Object[]{activity, reuVar, new Boolean(z)});
            return;
        }
        String[] strArr = reuVar.f27323a;
        if (z) {
            strArr = reuVar.b;
        }
        if (strArr != null) {
            for (String str2 : strArr) {
                str2.hashCode();
                if (!str2.equals(TRANSITION_TYPE_FADE)) {
                    if (str2.equals("push")) {
                        Map map = reuVar.f;
                        if (map != null) {
                            str = "direction";
                            if (akt.x0()) {
                                str = nwv.I(map.get(str), "right");
                            }
                        } else {
                            str = "right";
                        }
                        if (z) {
                            str.hashCode();
                            switch (str.hashCode()) {
                                case -1383228885:
                                    if (str.equals("bottom")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 115029:
                                    if (str.equals("top")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3317767:
                                    if (str.equals("left")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 108511772:
                                    if (str.equals("right")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    activity.overridePendingTransition(0, R.anim.tnode_push_bottom_out);
                                    continue;
                                case 1:
                                    activity.overridePendingTransition(0, R.anim.tnode_push_top_out);
                                    continue;
                                case 2:
                                    activity.overridePendingTransition(0, R.anim.tnode_push_left_out);
                                    continue;
                                case 3:
                                    activity.overridePendingTransition(0, R.anim.tnode_push_right_out);
                                    continue;
                            }
                        } else {
                            str.hashCode();
                            switch (str.hashCode()) {
                                case -1383228885:
                                    if (str.equals("bottom")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 115029:
                                    if (str.equals("top")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3317767:
                                    if (str.equals("left")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 108511772:
                                    if (str.equals("right")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    activity.overridePendingTransition(R.anim.tnode_push_bottom_in, R.anim.tnode_fake_out);
                                    continue;
                                case 1:
                                    activity.overridePendingTransition(R.anim.tnode_push_top_in, R.anim.tnode_fake_out);
                                    continue;
                                case 2:
                                    activity.overridePendingTransition(R.anim.tnode_push_left_in, R.anim.tnode_fake_out);
                                    continue;
                                case 3:
                                    activity.overridePendingTransition(R.anim.tnode_push_right_in, R.anim.tnode_fake_out);
                                    continue;
                            }
                        }
                    }
                } else if (z) {
                    activity.overridePendingTransition(0, 17432577);
                } else {
                    activity.overridePendingTransition(17432576, R.anim.tnode_fake_out);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Animator c(View view, String str, long j, TimeInterpolator timeInterpolator, Map map, boolean z) {
        ObjectAnimator objectAnimator;
        String str2;
        char c;
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("3e89fdb", new Object[]{view, str, new Long(j), timeInterpolator, map, new Boolean(z)});
        }
        str.hashCode();
        if (!str.equals(TRANSITION_TYPE_FADE)) {
            if (str.equals("push")) {
                if (map != null) {
                    str2 = nwv.I("direction", "right");
                } else {
                    str2 = "right";
                }
                if (!z) {
                    str2.hashCode();
                    switch (str2.hashCode()) {
                        case -1383228885:
                            if (str2.equals("bottom")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 115029:
                            if (str2.equals("top")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3317767:
                            if (str2.equals("left")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 108511772:
                            if (str2.equals("right")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            objectAnimator = ObjectAnimator.ofFloat(view, "translationY", s6o.n(view.getContext()), 0.0f);
                            break;
                        case 1:
                            objectAnimator = ObjectAnimator.ofFloat(view, "translationY", -s6o.n(view.getContext()), 0.0f);
                            break;
                        case 2:
                            objectAnimator = ObjectAnimator.ofFloat(view, "translationX", -s6o.B(view.getContext()), 0.0f);
                            break;
                        case 3:
                            objectAnimator = ObjectAnimator.ofFloat(view, "translationX", s6o.B(view.getContext()), 0.0f);
                            break;
                    }
                } else {
                    str2.hashCode();
                    switch (str2.hashCode()) {
                        case -1383228885:
                            if (str2.equals("bottom")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 115029:
                            if (str2.equals("top")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3317767:
                            if (str2.equals("left")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 108511772:
                            if (str2.equals("right")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            objectAnimator = ObjectAnimator.ofFloat(view, "translationY", s6o.n(view.getContext()));
                            break;
                        case 1:
                            objectAnimator = ObjectAnimator.ofFloat(view, "translationY", -s6o.n(view.getContext()));
                            break;
                        case 2:
                            objectAnimator = ObjectAnimator.ofFloat(view, "translationX", -s6o.B(view.getContext()));
                            break;
                        case 3:
                            objectAnimator = ObjectAnimator.ofFloat(view, "translationX", s6o.B(view.getContext()));
                            break;
                    }
                }
            }
            objectAnimator = null;
        } else if (z) {
            objectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        }
        if (objectAnimator != null) {
            objectAnimator.setDuration(j);
            objectAnimator.setInterpolator(timeInterpolator);
        }
        return objectAnimator;
    }
}
