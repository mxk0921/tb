package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IGlobalMenuAdapter;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.pub.extension.TBDefaultGlobalMenuPageExtension;
import java.util.ArrayList;
import java.util.HashMap;
import tb.bac;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class xwt extends TBDefaultGlobalMenuPageExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ITMSPage c;

    static {
        t2o.a(844103695);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwt(ITMSPage iTMSPage) {
        super(iTMSPage);
        ckf.g(iTMSPage, "page");
        this.c = iTMSPage;
    }

    public static /* synthetic */ Object ipc$super(xwt xwtVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1882913190) {
            super.w0();
            return null;
        } else if (hashCode == -22624812) {
            super.G((ITMSPage) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/pub/extension/TinyAppGlobalMenuPageExtension");
        }
    }

    @Override // com.taobao.themis.pub.extension.TBDefaultGlobalMenuPageExtension, tb.z5d
    public void G(ITMSPage iTMSPage) {
        bac.c cVar;
        bac.c cVar2;
        bac.c cVar3;
        bac.c cVar4;
        bac.c cVar5;
        bac.c cVar6;
        bac.c cVar7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        super.G(iTMSPage);
        IGlobalMenuAdapter iGlobalMenuAdapter = (IGlobalMenuAdapter) p8s.b(IGlobalMenuAdapter.class);
        if (iGlobalMenuAdapter != null) {
            ArrayList arrayList = new ArrayList();
            if (t8s.g(iTMSPage.c())) {
                if (q9s.E0() && (cVar7 = iGlobalMenuAdapter.mo333createMenuItemvVa9PYU(iTMSPage, sbs.INSTANCE.g())) != null) {
                    arrayList.add(cVar7);
                }
                if (q9s.v() && (cVar6 = iGlobalMenuAdapter.mo333createMenuItemvVa9PYU(iTMSPage, sbs.INSTANCE.b())) != null) {
                    arrayList.add(cVar6);
                }
                bac.c cVar8 = iGlobalMenuAdapter.mo333createMenuItemvVa9PYU(iTMSPage, sbs.INSTANCE.d());
                if (cVar8 != null) {
                    arrayList.add(cVar8);
                }
            } else if (!t8s.f(iTMSPage.c())) {
                if (iTMSPage.getInstance().a0() == TMSSolutionType.MINIGAME && (cVar4 = iGlobalMenuAdapter.mo333createMenuItemvVa9PYU(iTMSPage, sbs.INSTANCE.c())) != null) {
                    arrayList.add(cVar4);
                }
                if (!r8s.o(iTMSPage.getInstance()) && (cVar3 = iGlobalMenuAdapter.mo333createMenuItemvVa9PYU(iTMSPage, sbs.INSTANCE.a())) != null) {
                    arrayList.add(cVar3);
                }
                if (q9s.E0() && (cVar2 = iGlobalMenuAdapter.mo333createMenuItemvVa9PYU(iTMSPage, sbs.INSTANCE.g())) != null) {
                    arrayList.add(cVar2);
                }
                if (q9s.v() && (cVar = iGlobalMenuAdapter.mo333createMenuItemvVa9PYU(iTMSPage, sbs.INSTANCE.b())) != null) {
                    arrayList.add(cVar);
                }
                bac.c cVar9 = iGlobalMenuAdapter.mo333createMenuItemvVa9PYU(iTMSPage, sbs.INSTANCE.d());
                if (cVar9 != null) {
                    arrayList.add(cVar9);
                }
            } else if (iTMSPage.getInstance().a0() == TMSSolutionType.MINIGAME && (cVar5 = iGlobalMenuAdapter.mo333createMenuItemvVa9PYU(iTMSPage, sbs.INSTANCE.c())) != null) {
                arrayList.add(cVar5);
            }
            h().b(arrayList);
        }
    }

    public final IShareAdapter.b l(ITMSPage iTMSPage) {
        String uri;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IShareAdapter.b) ipChange.ipc$dispatch("7e793980", new Object[]{this, iTMSPage});
        }
        npd npdVar = (npd) iTMSPage.getExtension(npd.class);
        IShareAdapter.b K = npdVar == null ? null : npdVar.K();
        if (K == null) {
            if (!q9s.x2() || iTMSPage.getInstance().a0() != TMSSolutionType.UNIAPP) {
                uri = t8s.c(iTMSPage, iTMSPage.getInstance(), "", null).toString();
            } else {
                uri = iTMSPage.getInstance().e0();
            }
            ckf.f(uri, "if (TMSConfigUtils.enabl…tring()\n                }");
            K = new IShareAdapter.b("NewMiniapp", uri, null, null, null, null, null, null, 252, null);
            String b = K.b();
            if (b == null || b.length() == 0) {
                K.i("我在手淘发现了【" + ((Object) r8s.f(iTMSPage.getInstance())) + "】频道，我觉得特别符合你的style");
            }
            String d = K.d();
            if (d == null || d.length() == 0) {
                K.j("https://gw.alicdn.com/tfs/TB1qK6gbNnaK1RjSZFtXXbC2VXa-580-362.png");
            }
            String g = K.g();
            if (g == null || g.length() == 0) {
                K.l(r8s.f(iTMSPage.getInstance()));
            }
            if (K.f() == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("title", K.b());
                String d2 = K.d();
                if (d2 == null || d2.length() == 0) {
                    str = r8s.e(iTMSPage.getInstance());
                } else {
                    str = K.d();
                }
                hashMap.put("headImg", str);
                String g2 = K.g();
                if (g2 == null || g2.length() == 0) {
                    str2 = r8s.f(iTMSPage.getInstance());
                } else {
                    str2 = K.g();
                }
                hashMap.put("userNick", str2);
                String b2 = K.b();
                if (b2 == null || b2.length() == 0) {
                    str3 = r8s.b(iTMSPage.getInstance());
                } else {
                    str3 = K.b();
                }
                hashMap.put("description", str3);
                String g3 = K.g();
                if (g3 == null || g3.length() == 0) {
                    str4 = r8s.f(iTMSPage.getInstance());
                } else {
                    str4 = K.g();
                }
                hashMap.put("price", str4);
                HashMap hashMap2 = new HashMap();
                String g4 = K.g();
                if (g4 == null || g4.length() == 0) {
                    str5 = r8s.f(iTMSPage.getInstance());
                } else {
                    str5 = K.g();
                }
                hashMap2.put("title", str5);
                hashMap2.put("appLogo", r8s.e(iTMSPage.getInstance()));
                hashMap2.put("appName", r8s.f(iTMSPage.getInstance()));
                hashMap2.put("description", K.b());
                hashMap2.put("imageUrl", "");
                hashMap2.put("appDesc", r8s.b(iTMSPage.getInstance()));
                hashMap.put("shareInfo", hashMap2);
                hashMap.put("weexURL", "https://market.m.taobao.com/app/crs-qn/light-app-task-center/pages/backflow?wh_weex=true");
                hashMap.put("weexUrl", "https://market.m.taobao.com/app/crs-qn/light-app-task-center/pages/backflow?wh_weex=true");
                K.k(hashMap);
            }
        }
        return K;
    }

    @Override // com.taobao.themis.pub.extension.TBDefaultGlobalMenuPageExtension, tb.z5d
    public void w0() {
        String[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
            return;
        }
        super.w0();
        npd npdVar = (npd) this.c.getExtension(npd.class);
        if (npdVar != null) {
            TMSSolutionType a0 = this.c.getInstance().a0();
            TMSSolutionType tMSSolutionType = TMSSolutionType.UNIAPP;
            if (a0 == tMSSolutionType) {
                if (this.c.getInstance().a0() == tMSSolutionType && wsq.O(this.c.c(), ges.SOURCE_URL, false, 2, null)) {
                    Window.c g = qml.g(this.c);
                    if (!(g == null || (a2 = g.a()) == null || !ic1.B(a2, "share"))) {
                        return;
                    }
                } else {
                    return;
                }
            }
            npdVar.l1(l(this.c));
        }
    }
}
