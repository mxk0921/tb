package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.mmad.data.BaseMmAdModel;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f17229a;
    public JSONObject b;
    public JSONObject c;
    public JSONObject d;
    public JSONObject e;
    public JSONObject f;
    public JSONObject g;
    public JSONObject h;
    public JSONObject i;
    public JSONObject j;
    public JSONObject k;
    public JSONObject l;
    public final nwi m;
    public final kio n;
    public final rr6 o = new rr6();
    public BaseMmAdModel p;

    static {
        t2o.a(573571130);
    }

    public cq6(nwi nwiVar) {
        this.m = nwiVar;
        this.n = new kio(nwiVar);
    }

    public BaseMmAdModel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseMmAdModel) ipChange.ipc$dispatch("97365385", new Object[]{this});
        }
        return this.p;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d791813f", new Object[]{this});
        }
        return this.k;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4c24a8e0", new Object[]{this});
        }
        return this.l;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f2bc674e", new Object[]{this});
        }
        return this.c;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4f51202", new Object[]{this});
        }
        return this.d;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f013025", new Object[]{this});
        }
        return this.f;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5a9fcbb4", new Object[]{this});
        }
        return this.f17229a;
    }

    public JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a234ffb7", new Object[]{this});
        }
        return this.e;
    }

    public JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2ccc0450", new Object[]{this});
        }
        return this.h;
    }

    public JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e7b0a21", new Object[]{this});
        }
        return this.g;
    }

    public JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("20adc768", new Object[]{this});
        }
        return this.j;
    }

    public JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a7b846d1", new Object[]{this});
        }
        return this.i;
    }

    public JSONObject m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("53006ce", new Object[]{this});
        }
        return this.b;
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209251a0", new Object[]{this});
        } else {
            q(false);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ed0bdb", new Object[]{this});
        } else {
            this.n.g().c();
        }
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b89534", new Object[]{this, new Boolean(z)});
            return;
        }
        jgh.a("DataEngine", "resetData");
        this.f17229a = null;
        this.d = null;
        this.b = null;
        this.c = null;
        if (z) {
            this.p = null;
        }
        nwi nwiVar = this.m;
        if (nwiVar != null) {
            nwiVar.a().g(false);
        }
    }

    public final boolean n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9a09c00", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return true;
        }
        if (!jSONObject.containsKey("launchCnt")) {
            jgh.a("DataEngine", "launchCnt isLaunchCntLegal: ");
            return true;
        }
        int b = hj7.b();
        String string = jSONObject.getString("launchCnt");
        jgh.a("DataEngine", " launchCnt contain json launchCountStr =" + string + ", applaunchCount=" + b);
        if (TextUtils.isEmpty(string)) {
            jgh.a("DataEngine", " launchCnt parse: launchCountStr is null");
            return false;
        } else if (!string.contains(String.valueOf(b))) {
            jgh.a("DataEngine", " launchCnt launchCount check fail launchCountData=" + string + ",applaunchCount=" + b);
            return false;
        } else {
            jgh.a("DataEngine", "parse: launchCnt bizData contain launchCnt.");
            return true;
        }
    }

    public void o(List<JSONObject> list, int i) {
        String str;
        int i2;
        List<JSONObject> list2 = list;
        int i3 = 0;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61261b8", new Object[]{this, list2, new Integer(i)});
        } else if (list2 != null) {
            m0j.c(this.m, "start");
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            jgh.a("DataEngine", "parse start data size=" + size);
            while (true) {
                if (i3 >= size) {
                    break;
                }
                JSONObject jSONObject = list2.get(i3);
                if (jSONObject == null) {
                    jgh.a("DataEngine", "dataJson in for-each null");
                } else {
                    String str2 = null;
                    this.f17229a = null;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
                    if (jSONObject2 != null) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_SPLASH);
                        this.b = jSONObject3;
                        if (jSONObject3 != null) {
                            JSONObject jSONObject4 = jSONObject2.getJSONObject("feeds");
                            this.h = jSONObject4;
                            f69.c(jSONObject4);
                            this.i = jSONObject2.getJSONObject(rr6.TYPE_POPVIEW);
                            this.e = this.b.getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
                            JSONObject jSONObject5 = this.b.getJSONObject("bizData");
                            this.c = jSONObject5;
                            if (jSONObject5 != null) {
                                if (!n(jSONObject5)) {
                                    q(z);
                                } else {
                                    str2 = this.c.getString("creativeId");
                                    sb.append(str2);
                                    if (list2.indexOf(jSONObject) != size - 1) {
                                        sb.append(",");
                                    }
                                }
                            }
                            JSONObject jSONObject6 = this.b.getJSONObject("subSection");
                            if (jSONObject6 != null) {
                                if (jSONObject6.getJSONObject("interactExpo") != null) {
                                    this.g = jSONObject6.getJSONObject("interactExpo").getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
                                }
                                if (jSONObject6.getJSONObject("animationExpo") != null) {
                                    this.k = jSONObject6.getJSONObject("animationExpo").getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
                                }
                                if (jSONObject6.getJSONObject("coldStartExpo") != null) {
                                    this.f = jSONObject6.getJSONObject("coldStartExpo").getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
                                }
                            }
                            JSONObject jSONObject7 = this.b.getJSONObject("item");
                            if (jSONObject7 == null) {
                                q(z);
                            } else {
                                String str3 = "0";
                                JSONObject jSONObject8 = jSONObject7.getJSONObject(str3);
                                if (jSONObject8 == null) {
                                    q(z);
                                } else {
                                    this.d = jSONObject8.getJSONObject("clickParam");
                                    JSONObject jSONObject9 = jSONObject8.getJSONObject("content");
                                    this.f17229a = jSONObject9;
                                    if (jSONObject9 == null) {
                                        jgh.a("DataEngine", "content null");
                                        q(true);
                                    } else {
                                        JSONObject jSONObject10 = jSONObject7.getJSONObject("1");
                                        if (jSONObject10 != null) {
                                            this.j = jSONObject10.getJSONObject("clickParam");
                                        }
                                        JSONObject jSONObject11 = jSONObject7.getJSONObject("2");
                                        if (jSONObject11 != null) {
                                            this.l = jSONObject11.getJSONObject("clickParam");
                                        }
                                        boolean equals = this.f17229a.containsKey("verifyData") ? "true".equals(this.f17229a.getString("verifyData")) : true;
                                        if (j0o.f(this.m) && equals) {
                                            this.m.g().b().k();
                                            DXTemplateItem a2 = ya6.a(this.b);
                                            if (a2 == null) {
                                                jgh.a("DataEngine", "parse: CheckDXBeforeShow templateItem is null");
                                                i2 = 1;
                                                q(true);
                                            } else if (this.m.g().b().g(a2) == null) {
                                                jgh.a("DataEngine", "parse: CheckDXBeforeShow fetchTemplate is null");
                                                m0j.d(this.m, "dx_not_ready", a2.e());
                                                i2 = 1;
                                                q(true);
                                            }
                                            i3 += i2;
                                            list2 = list;
                                            z = true;
                                        }
                                        this.f17229a.put(i2b.TRACK_EXPOSURE_PARAM, (Object) this.e);
                                        this.f17229a.put("targetUrl", jSONObject8.get("targetUrl"));
                                        BaseMmAdModel b = this.o.b(this.f17229a);
                                        this.p = b;
                                        if (b == null) {
                                            jgh.a("DataEngine", "parse: adModel is null");
                                            i2 = 1;
                                            q(true);
                                        } else {
                                            b.setDataType(this.o.a(jSONObject2));
                                            this.p.setTargetUrl(jSONObject8.getString("targetUrl"));
                                            this.p.setCreativeId(str2);
                                            if (!equals || this.n.h(this, i)) {
                                                boolean j = this.m.c().j(jSONObject, i);
                                                jgh.a("DataEngine", "shouldShow=" + j);
                                                HashMap hashMap = new HashMap();
                                                if (j) {
                                                    str3 = "1";
                                                }
                                                hashMap.put("shouldShow", str3);
                                                i4v.l(i4v.ARG1_SHOULD_SHOW_RESULT, this.m, hashMap);
                                                if (j) {
                                                    this.p.sceneType = nwi.BIZ_CODE;
                                                    jgh.a("DataEngine", "parse end ShouldShow success. " + i3);
                                                    break;
                                                }
                                                i2 = 1;
                                                q(true);
                                            } else {
                                                jgh.a("DataEngine", "verifyResult failed");
                                                i2 = 1;
                                                q(true);
                                            }
                                        }
                                        i3 += i2;
                                        list2 = list;
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = 1;
                i3 += i2;
                list2 = list;
                z = true;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("createid_ids", sb.toString());
            BaseMmAdModel baseMmAdModel = this.p;
            if (baseMmAdModel == null) {
                str = "";
            } else {
                str = baseMmAdModel.getCreativeId();
            }
            hashMap2.put("selected_id", str);
            i4v.l(i4v.ARG1_CHOOSE_RESULT, this.m, hashMap2);
            if (this.p != null) {
                m0j.c(this.m, "success");
                this.m.a().g(true);
            }
        }
    }
}
