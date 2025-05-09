package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yns extends xql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AI_MATCH = "aiMatch";
    public static final String KEY_BOTTOM_BAR = "bottomBar";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_DESC_SUFFIX_SHRINK = "descSuffixShrink";
    public static final String KEY_DIVISION_DESC = "divisionDesc";
    public static final String KEY_DIVISION_RECOMMEND = "divisionRecd";
    public static final String KEY_HEADER_PIC = "headerPic";
    public static final String KEY_MAIN_SCREEN = "mainScreen";
    public static final String KEY_NAV_BAR = "navBar";
    public static final String KEY_RECOMMEND = "recommend";
    public static final String KEY_TT_FLOAT = "ttFloat";
    public z4k h;
    public ava i;
    public e1i j;
    public z4k k;
    public z4k l;
    public z4k m;
    public z4k n;
    public z4k o;
    public z4k p;
    public xi2 q;
    public eos r;

    static {
        t2o.a(912261660);
    }

    public yns(JSONObject jSONObject, ob4 ob4Var) {
        super(jSONObject, ob4Var);
        n(jSONObject, ob4Var);
    }

    public static /* synthetic */ Object ipc$super(yns ynsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/layout/TTDetailLayoutNode");
    }

    public xi2 o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xi2) ipChange.ipc$dispatch("16c18a6b", new Object[]{this});
        }
        return this.q;
    }

    public z4k<wua> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4k) ipChange.ipc$dispatch("28ef39ca", new Object[]{this});
        }
        return this.i;
    }

    public e1i q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e1i) ipChange.ipc$dispatch("e1c46c6f", new Object[]{this});
        }
        return this.j;
    }

    public z4k r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4k) ipChange.ipc$dispatch("38d336a9", new Object[]{this});
        }
        return this.h;
    }

    public Map<String, z4k> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("39131b75", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e1i e1iVar = this.j;
        if (e1iVar != null) {
            linkedHashMap.put("mainScreen", e1iVar);
        }
        z4k z4kVar = this.k;
        if (z4kVar != null) {
            linkedHashMap.put(KEY_DIVISION_DESC, z4kVar);
        }
        z4k z4kVar2 = this.l;
        if (z4kVar2 != null) {
            linkedHashMap.put("description", z4kVar2);
        }
        z4k z4kVar3 = this.m;
        if (z4kVar3 != null) {
            linkedHashMap.put("descSuffixShrink", z4kVar3);
        }
        z4k z4kVar4 = this.p;
        if (z4kVar4 != null) {
            linkedHashMap.put(KEY_AI_MATCH, z4kVar4);
        }
        z4k z4kVar5 = this.n;
        if (z4kVar5 != null) {
            linkedHashMap.put(KEY_DIVISION_RECOMMEND, z4kVar5);
        }
        z4k z4kVar6 = this.o;
        if (z4kVar6 != null) {
            linkedHashMap.put("recommend", z4kVar6);
        }
        return linkedHashMap;
    }

    public eos t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eos) ipChange.ipc$dispatch("8316503", new Object[]{this});
        }
        return this.r;
    }

    public final void n(JSONObject jSONObject, ob4 ob4Var) {
        JSONObject jSONObject2;
        e1i e1iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a5d2b5", new Object[]{this, jSONObject, ob4Var});
            return;
        }
        for (String str : jSONObject.keySet()) {
            if (!(str == null || (jSONObject2 = jSONObject.getJSONObject(str)) == null)) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1855408664:
                        if (str.equals("bottomBar")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1724546052:
                        if (str.equals("description")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1655995170:
                        if (str.equals(KEY_DIVISION_DESC)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1655578591:
                        if (str.equals(KEY_DIVISION_RECOMMEND)) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1052597264:
                        if (str.equals("navBar")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1034800196:
                        if (str.equals(KEY_TT_FLOAT)) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1026279811:
                        if (str.equals(KEY_AI_MATCH)) {
                            c = 6;
                            break;
                        }
                        break;
                    case -213307459:
                        if (str.equals("headerPic")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 449233797:
                        if (str.equals("mainScreen")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 844540395:
                        if (str.equals("descSuffixShrink")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 989204668:
                        if (str.equals("recommend")) {
                            c = '\n';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        xi2 xi2Var = new xi2(jSONObject2, ob4Var);
                        this.q = xi2Var;
                        e1iVar = xi2Var;
                        break;
                    case 1:
                        z4k z4kVar = new z4k(jSONObject2, ob4Var);
                        this.l = z4kVar;
                        e1iVar = z4kVar;
                        break;
                    case 2:
                        z4k z4kVar2 = new z4k(jSONObject2, ob4Var);
                        this.k = z4kVar2;
                        e1iVar = z4kVar2;
                        break;
                    case 3:
                        z4k z4kVar3 = new z4k(jSONObject2, ob4Var);
                        this.n = z4kVar3;
                        e1iVar = z4kVar3;
                        break;
                    case 4:
                        z4k z4kVar4 = new z4k(jSONObject2, ob4Var);
                        this.h = z4kVar4;
                        e1iVar = z4kVar4;
                        break;
                    case 5:
                        eos eosVar = new eos(jSONObject2, ob4Var);
                        this.r = eosVar;
                        e1iVar = eosVar;
                        break;
                    case 6:
                        z4k z4kVar5 = new z4k(jSONObject2, ob4Var);
                        this.p = z4kVar5;
                        e1iVar = z4kVar5;
                        break;
                    case 7:
                        ava avaVar = new ava(jSONObject2, ob4Var);
                        this.i = avaVar;
                        e1iVar = avaVar;
                        break;
                    case '\b':
                        e1i e1iVar2 = new e1i(jSONObject2, ob4Var);
                        this.j = e1iVar2;
                        e1iVar = e1iVar2;
                        break;
                    case '\t':
                        z4k z4kVar6 = new z4k(jSONObject2, ob4Var);
                        this.m = z4kVar6;
                        e1iVar = z4kVar6;
                        break;
                    case '\n':
                        z4k z4kVar7 = new z4k(jSONObject2, ob4Var);
                        this.o = z4kVar7;
                        e1iVar = z4kVar7;
                        break;
                    default:
                        e1iVar = null;
                        break;
                }
                if (e1iVar != null) {
                    j(e1iVar);
                }
            }
        }
    }
}
