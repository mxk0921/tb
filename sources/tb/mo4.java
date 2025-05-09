package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.ContentCommissionActionSourceType;
import com.taobao.android.abilityidl.ability.ContentCommissionPlatformType;
import com.taobao.android.abilityidl.ability.ContentCommissionPopularizeTargetSceneType;
import com.taobao.android.abilityidl.ability.ContentCommissionSourceType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mo4 {

    /* renamed from: a  reason: collision with root package name */
    public String f24177a;
    public String b;
    public String c;
    public String d;
    public String e;
    public final String f;
    public String g;
    public String h;
    public final String i;
    public final String j;
    public Map<String, ? extends Object> k;
    public Map<String, ? extends Object> l;
    public Map<String, ? extends Object> m;
    public Map<String, ? extends Object> n;

    static {
        t2o.a(525336841);
    }

    public mo4() {
        this.f24177a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
    }

    public mo4(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "adUserID", null);
        if (x != null) {
            this.f24177a = x;
            String x2 = MegaUtils.x(map, "itemID", null);
            if (x2 != null) {
                this.b = x2;
                String x3 = MegaUtils.x(map, "contentID", null);
                if (x3 != null) {
                    this.c = x3;
                    String x4 = MegaUtils.x(map, "businessScenceID", null);
                    if (x4 != null) {
                        this.d = x4;
                        String a2 = ContentCommissionSourceType.Companion.a(MegaUtils.x(map, "sourceType", null));
                        if (a2 != null) {
                            this.e = a2;
                            if (ContentCommissionPlatformType.Companion.a(MegaUtils.x(map, "platformType", null)) != null) {
                                String a3 = ContentCommissionActionSourceType.Companion.a(MegaUtils.x(map, "actionSource", null));
                                if (a3 != null) {
                                    this.f = a3;
                                    String a4 = ContentCommissionPopularizeTargetSceneType.Companion.a(MegaUtils.x(map, "popularizeTargetType", null));
                                    if (a4 != null) {
                                        this.g = a4;
                                        MegaUtils.x(map, "sellerID", null);
                                        this.h = MegaUtils.x(map, "tcpSceneID", null);
                                        MegaUtils.x(map, "source", null);
                                        this.i = MegaUtils.x(map, "trackSource", null);
                                        this.j = MegaUtils.x(map, "trackSubSource", null);
                                        MegaUtils.x(map, "pageName", null);
                                        MegaUtils.x(map, "utdid", null);
                                        List<Object> o = MegaUtils.o(map, "itemIDs");
                                        if (o != null) {
                                            List<Object> list = o;
                                            ArrayList arrayList = new ArrayList(zz3.q(list, 10));
                                            for (Object obj : list) {
                                                if (obj != null) {
                                                    try {
                                                        arrayList.add((String) obj);
                                                    } catch (Exception e) {
                                                        throw new RuntimeException("itemIDs 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                                                    }
                                                } else {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                                }
                                                throw new RuntimeException("itemIDs 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                                            }
                                        }
                                        this.k = MegaUtils.s(map, "context");
                                        this.l = MegaUtils.s(map, "dataAttributes");
                                        this.m = MegaUtils.s(map, "extParams");
                                        this.n = MegaUtils.s(map, "config");
                                        return;
                                    }
                                    throw new RuntimeException("popularizeTargetType 参数必传！");
                                }
                                throw new RuntimeException("actionSource 参数必传！");
                            }
                            throw new RuntimeException("platformType 参数必传！");
                        }
                        throw new RuntimeException("sourceType 参数必传！");
                    }
                    throw new RuntimeException("businessScenceID 参数必传！");
                }
                throw new RuntimeException("contentID 参数必传！");
            }
            throw new RuntimeException("itemID 参数必传！");
        }
        throw new RuntimeException("adUserID 参数必传！");
    }
}
