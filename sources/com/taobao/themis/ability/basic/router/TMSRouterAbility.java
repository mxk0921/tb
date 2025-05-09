package com.taobao.themis.ability.basic.router;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsRouterAbility;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.bbs;
import tb.cho;
import tb.ckf;
import tb.jdb;
import tb.k9z;
import tb.kdb;
import tb.pnb;
import tb.q9s;
import tb.swd;
import tb.t2o;
import tb.t6s;
import tb.tao;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ1\u0010\u0015\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\nJ'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/taobao/themis/ability/basic/router/TMSRouterAbility;", "Lcom/taobao/android/abilityidl/ability/AbsRouterAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/jdb;", "callback", "Ltb/xhv;", "closeApp", "(Ltb/kdb;Ltb/jdb;)V", "Ltb/cho;", "params", "replacePage", "(Ltb/kdb;Ltb/cho;Ltb/jdb;)V", "resetToPage", "Ltb/tao;", "", "", "", "Lcom/alibaba/ability/result/ErrorResult;", "getPageProps", "(Ltb/kdb;)Ltb/tao;", "popPage", "popToRoot", t6s.BRIDGE_ACTION_PUSHPAGE, "themis_ability_basic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSRouterAbility extends AbsRouterAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(830472222);
            int[] iArr = new int[TMSSolutionType.values().length];
            iArr[TMSSolutionType.UNIAPP.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(830472221);
    }

    public static /* synthetic */ Object ipc$super(TMSRouterAbility tMSRouterAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability/basic/router/TMSRouterAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public void closeApp(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d7f6bb", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
        } else if (CommonExtKt.g(kdbVar) == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
        } else {
            pnb pnbVar = (pnb) h.getExtension(pnb.class);
            if (pnbVar == null) {
                jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            } else {
                pnbVar.Y();
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public tao<Map<String, Object>, ErrorResult> getPageProps(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("f1b22811", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "context");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            return new tao<>(null, ErrorResult.a.d("容器页面未找到"));
        }
        Map<String, Object> f = h.getPageParams().f();
        if (f == null) {
            f = new LinkedHashMap<>();
        }
        return new tao<>(f);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public void pushPage(kdb kdbVar, cho choVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f95f7e", new Object[]{this, kdbVar, choVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(choVar, "params");
        ckf.g(jdbVar, "callback");
        bbs g = CommonExtKt.g(kdbVar);
        if (g == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
        } else if (g.O() == TMSContainerType.EMBEDDED) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        } else {
            ITMSPage a2 = a(g, choVar, jdbVar);
            if (a2 != null) {
                k9z k9zVar = (k9z) g.getExtension(k9z.class);
                if (k9zVar != null) {
                    k9zVar.handleAdUrl(a2.c());
                }
                g.W().a(a2);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public void replacePage(kdb kdbVar, cho choVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4e03f98", new Object[]{this, kdbVar, choVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(choVar, "params");
        ckf.g(jdbVar, "callback");
        bbs g = CommonExtKt.g(kdbVar);
        if (g == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
        } else if (g.O() == TMSContainerType.EMBEDDED) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        } else {
            ITMSPage a2 = a(g, choVar, jdbVar);
            if (a2 != null) {
                k9z k9zVar = (k9z) g.getExtension(k9z.class);
                if (k9zVar != null) {
                    k9zVar.handleAdUrl(a2.c());
                }
                g.W().g(a2);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public void resetToPage(kdb kdbVar, cho choVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec46748e", new Object[]{this, kdbVar, choVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(choVar, "params");
        ckf.g(jdbVar, "callback");
        bbs g = CommonExtKt.g(kdbVar);
        if (g == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
        } else if (g.O() == TMSContainerType.EMBEDDED) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        } else {
            ITMSPage a2 = a(g, choVar, jdbVar);
            if (a2 != null) {
                k9z k9zVar = (k9z) g.getExtension(k9z.class);
                if (k9zVar != null) {
                    k9zVar.handleAdUrl(a2.c());
                }
                g.W().d(a2);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public void popToRoot(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb295a0", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        bbs g = CommonExtKt.g(kdbVar);
        if (g == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
        } else if (g.O() == TMSContainerType.EMBEDDED) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        } else {
            g.W().b(0);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public void popPage(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93eda4f2", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        bbs g = CommonExtKt.g(kdbVar);
        if (g == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
        } else if (g.O() == TMSContainerType.EMBEDDED) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        } else if (q9s.D1()) {
            g.W().f(true);
        } else {
            swd W = g.W();
            ckf.f(W, "instance.pageManager");
            swd.a.a(W, false, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0119, code lost:
        if (r3.equals(r6) == false) goto L_0x0122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0120, code lost:
        if (r3.equals(r8) == false) goto L_0x0122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.themis.kernel.page.ITMSPage a(tb.bbs r23, tb.cho r24, tb.jdb r25) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability.basic.router.TMSRouterAbility.a(tb.bbs, tb.cho, tb.jdb):com.taobao.themis.kernel.page.ITMSPage");
    }
}
