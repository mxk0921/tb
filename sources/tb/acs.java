package tb;

import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.n5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class acs extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements n5d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gld f15665a;

        public a(gld gldVar) {
            this.f15665a = gldVar;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7cc64eb", new Object[]{this, new Boolean(z)});
                return;
            }
            bbs bbsVar = acs.this.b;
            if (bbsVar != null) {
                bbsVar.S().b("frameworkPackageFinish");
                String str = "localLoad";
                acs.this.b.S().a("frameworkPackageStrategy", z ? "onlineLoad" : str);
                gld gldVar = this.f15665a;
                if (gldVar != null) {
                    gldVar.C("frameworkPackageFinish");
                    gld gldVar2 = this.f15665a;
                    if (z) {
                        str = "onlineLoad";
                    }
                    gldVar2.D("frameworkPackageStrategy", str);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFromNetwork", (Object) Boolean.valueOf(z));
            String str2 = acs.this.c;
            mcs.e(mcs.MODULE_LAUNCH_PACKAGE, mcs.EVENT_DOWNLOAD_FINISH, str2, acs.this.c + "_framework", jSONObject);
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5caa8780", new Object[]{this, new Integer(i)});
            }
        }

        public void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a1c959", new Object[]{this, new Integer(i)});
            }
        }

        public void e(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66fc15f6", new Object[]{this, str, new Boolean(z)});
                return;
            }
            bbs bbsVar = acs.this.b;
            if (bbsVar != null) {
                bbsVar.S().b("pluginPackageFinish");
            }
            gld gldVar = this.f15665a;
            if (gldVar != null) {
                gldVar.C("pluginPackageFinish");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFromNetwork", (Object) Boolean.valueOf(z));
            String str2 = acs.this.c;
            mcs.e(mcs.MODULE_LAUNCH_PACKAGE, mcs.EVENT_DOWNLOAD_FINISH, str2, acs.this.c + "_plugin_" + str, jSONObject);
        }

        public void f(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb7a9cb", new Object[]{this, str, new Integer(i)});
            }
        }

        public void g(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fae07609", new Object[]{this, new Integer(i), str});
                return;
            }
            acs acsVar = acs.this;
            acs.l(acsVar, acs.k(acsVar, i, str));
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1550b45", new Object[]{this});
                return;
            }
            TMSLogger.b("TMSPackageStep", "finish");
            acs.this.i();
        }

        public void c(boolean z) {
            Long G;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2c4904", new Object[]{this, new Boolean(z)});
                return;
            }
            bbs bbsVar = acs.this.b;
            String str = "localLoad";
            if (bbsVar != null) {
                bbsVar.S().b("mainPackageFinish");
                acs.this.b.S().a("MainPackageLocalZCache", String.valueOf(true ^ z));
                acs.this.b.S().a("mainPackageStrategy", z ? "onlineLoad" : str);
                ekd ekdVar = (ekd) acs.this.b.getExtension(ekd.class);
                if (!(ekdVar == null || (G = ekdVar.G()) == null)) {
                    acs.this.b.S().a("mainPackageSize", String.valueOf(G));
                }
            }
            gld gldVar = this.f15665a;
            if (gldVar != null) {
                gldVar.C("mainPackageFinish");
                gld gldVar2 = this.f15665a;
                if (z) {
                    str = "onlineLoad";
                }
                gldVar2.D("mainPackageStrategy", str);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFromNetwork", (Object) Boolean.valueOf(z));
            String str2 = acs.this.c;
            mcs.e(mcs.MODULE_LAUNCH_PACKAGE, mcs.EVENT_DOWNLOAD_FINISH, str2, acs.this.c + "_main", jSONObject);
        }
    }

    static {
        t2o.a(843055265);
    }

    public acs(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
    }

    public static /* synthetic */ Object ipc$super(acs acsVar, String str, Object... objArr) {
        if (str.hashCode() == -790391893) {
            super.i();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/launch_step/TMSPackageStep");
    }

    public static /* synthetic */ eas k(acs acsVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eas) ipChange.ipc$dispatch("88836668", new Object[]{acsVar, new Integer(i), str});
        }
        return acsVar.m(i, str);
    }

    public static /* synthetic */ void l(acs acsVar, eas easVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b1dde6c", new Object[]{acsVar, easVar});
        } else {
            acsVar.g(easVar);
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "Package";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            return;
        }
        super.i();
        bbs bbsVar = this.b;
        if (bbsVar != null) {
            gld m = CommonExtKt.m(bbsVar);
            if (m != null) {
                m.C("packageStepFinish");
            }
            this.b.S().b("packageStepFinish");
        }
        lwd lwdVar = this.j;
        if (lwdVar != null) {
            lwdVar.e();
        }
    }

    public final eas m(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eas) ipChange.ipc$dispatch("105c6411", new Object[]{this, new Integer(i), str});
        }
        if (i == -90004) {
            return new eas("TMS_ERR_PKG_UNZIP", "package解压错误", "");
        }
        if (i != -1) {
            return new eas("TMS_ERR_PKG_REQ", "package请求错误", "");
        }
        return new eas("TMS_ERR_PKG_REQ", "package请求超时", "");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void h() {
        n5d n5dVar;
        c9d c9dVar;
        jkl jklVar;
        jkl jklVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
            return;
        }
        bbs bbsVar = this.b;
        if (bbsVar != null && !bbsVar.g0() && (n5dVar = (n5d) this.b.getExtension(n5d.class)) != null && (c9dVar = (c9d) this.b.getExtension(c9d.class)) != null) {
            String str = "packageStepStart";
            this.b.S().b(str);
            TMSMetaInfoWrapper P = this.b.P();
            ArrayList arrayList = new ArrayList();
            String str2 = "pkgInfo";
            if (P != null) {
                jkl jklVar3 = new jkl(P.k(), P.b(), P.l(), c9dVar.p0(), c9dVar.j());
                List<PluginModel> g = P.g();
                if (g != null && g.size() > 0) {
                    Iterator<PluginModel> it = g.iterator();
                    while (it.hasNext()) {
                        PluginModel next = it.next();
                        arrayList.add(new jkl(next.getAppId(), next.getAppId(), next.getVersion(), c9dVar.A(next), c9dVar.x(next)));
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject.put(str2, (Object) jSONObject2);
                        jSONObject2.put("appId", (Object) (next.getAppId() + "_plugin"));
                        jSONObject2.put("packUrl", (Object) c9dVar.A(next));
                        jSONObject2.put("version", (Object) next.getVersion());
                        jSONObject2.put("zcacheKey", (Object) c9dVar.x(next));
                        String str3 = this.c;
                        mcs.e(mcs.MODULE_LAUNCH_PACKAGE, mcs.EVENT_DOWNLOAD_START, str3, this.c + "_plugin" + next.getAppId(), jSONObject);
                        it = it;
                        n5dVar = n5dVar;
                        str = str;
                        arrayList = arrayList;
                    }
                }
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject3.put(str2, (Object) jSONObject4);
                jSONObject4.put("appId", (Object) P.b());
                jSONObject4.put("packUrl", (Object) c9dVar.p0());
                jSONObject4.put("version", (Object) P.l());
                jSONObject4.put("zcacheKey", (Object) c9dVar.j());
                String str4 = this.c;
                mcs.e(mcs.MODULE_LAUNCH_PACKAGE, mcs.EVENT_DOWNLOAD_START, str4, this.c + "_framework", jSONObject3);
                jklVar = jklVar3;
            } else {
                n5dVar = n5dVar;
                str = str;
                arrayList = arrayList;
                jklVar = null;
            }
            if (this.b.U() != null) {
                String L = this.b.L();
                String i = r8s.i(this.b);
                if (q9s.C1()) {
                    String w = r8s.w(this.b);
                    if (!TextUtils.isEmpty(w)) {
                        L = w;
                    }
                    String y = r8s.y(this.b);
                    if (!TextUtils.isEmpty(y)) {
                        i = y;
                    }
                }
                String f = r8s.f(this.b);
                if (f == null) {
                    f = "";
                }
                jklVar2 = new jkl(f, L, i, c9dVar.l(), c9dVar.o());
                JSONObject jSONObject5 = new JSONObject();
                JSONObject jSONObject6 = new JSONObject();
                jSONObject5.put(str2, (Object) jSONObject6);
                jSONObject6.put("appId", (Object) L);
                jSONObject6.put("packUrl", (Object) c9dVar.l());
                jSONObject6.put("version", (Object) i);
                jSONObject6.put("zcacheKey", (Object) c9dVar.o());
                String str5 = this.c;
                mcs.e(mcs.MODULE_LAUNCH_PACKAGE, mcs.EVENT_DOWNLOAD_START, str5, this.c + "_main", jSONObject5);
                List<PluginModel> g2 = this.b.U().g();
                if (g2 != null) {
                    Iterator<PluginModel> it2 = g2.iterator();
                    while (it2.hasNext()) {
                        PluginModel next2 = it2.next();
                        if ("2".equals(next2.getPluginType())) {
                            arrayList = arrayList;
                            arrayList.add(new jkl(next2.getAppId(), next2.getAppId(), next2.getVersion(), c9dVar.A(next2), c9dVar.x(next2)));
                            JSONObject jSONObject7 = new JSONObject();
                            it2 = it2;
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject7.put(str2, (Object) jSONObject8);
                            jklVar2 = jklVar2;
                            StringBuilder sb = new StringBuilder();
                            str2 = str2;
                            sb.append(next2.getAppId());
                            sb.append("_plugin");
                            jSONObject8.put("appId", (Object) sb.toString());
                            jSONObject8.put("packUrl", (Object) c9dVar.A(next2));
                            jSONObject8.put("version", (Object) next2.getVersion());
                            jSONObject8.put("zcacheKey", (Object) c9dVar.x(next2));
                            String str6 = this.c;
                            mcs.e(mcs.MODULE_LAUNCH_PACKAGE, mcs.EVENT_DOWNLOAD_START, str6, this.c + "_plugin_" + next2.getAppId(), jSONObject7);
                        } else {
                            it2 = it2;
                            jklVar2 = jklVar2;
                            arrayList = arrayList;
                            str2 = str2;
                        }
                    }
                }
            } else {
                arrayList = arrayList;
                jklVar2 = null;
            }
            gld m = CommonExtKt.m(this.b);
            if (m != null) {
                m.C(str);
            }
            n5dVar.d0(jklVar, jklVar2, arrayList, new a(m));
        }
    }
}
