package tb;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tg3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f28700a;
    public List<BaseCellBean> b;
    public final int c = p1p.a(390.0f);
    public final c d;
    public b e;
    public final acx<? extends o02<? extends BaseSearchResult, ?>> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f28701a;

        static {
            t2o.a(993002093);
        }

        private b() {
            this.f28701a = false;
        }

        public static /* synthetic */ void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c524a93", new Object[]{bVar});
            } else {
                bVar.b();
            }
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
            } else {
                this.f28701a = true;
            }
        }

        private boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
            }
            return this.f28701a;
        }

        private void d() {
            int i;
            boolean z;
            int i2;
            int i3;
            int i4;
            BaseCellBean baseCellBean;
            BaseCellBean baseCellBean2;
            int abs;
            int i5 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b594752", new Object[]{this});
                return;
            }
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            int size = tg3.a(tg3.this).size();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            MuiseCellBean muiseCellBean = null;
            MuiseCellBean muiseCellBean2 = null;
            int i9 = 0;
            while (i6 < size && !c()) {
                BaseCellBean baseCellBean3 = (BaseCellBean) tg3.a(tg3.this).get(i6);
                if (!(baseCellBean3 instanceof MuiseCellBean)) {
                    i = 1;
                } else {
                    MuiseCellBean muiseCellBean3 = (MuiseCellBean) baseCellBean3;
                    muiseCellBean3.clipHeight = i5;
                    if (tg3.b(tg3.this, muiseCellBean3)) {
                        rect.setEmpty();
                        rect2.setEmpty();
                        i = 1;
                        i7 = 0;
                        i8 = 0;
                        muiseCellBean = null;
                        muiseCellBean2 = null;
                    } else {
                        if (i7 <= i8) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int cachedHeight = muiseCellBean3.mMuiseBean.getCachedHeight(ListStyle.WATERFALL);
                        if (cachedHeight <= 0 && (cachedHeight = tg3.c(tg3.this, muiseCellBean3)) <= 0) {
                            cachedHeight = tg3.d(tg3.this);
                        }
                        if (muiseCellBean3.invisibleCell) {
                            cachedHeight = 0;
                        }
                        if (z) {
                            i4 = cachedHeight + i7;
                            i2 = i8;
                            i3 = i4;
                        } else {
                            i4 = cachedHeight + i8;
                            i2 = i4;
                            i3 = i7;
                            i7 = i8;
                        }
                        if (i6 < size - 1) {
                            baseCellBean = (BaseCellBean) tg3.a(tg3.this).get(i6 + 1);
                        } else {
                            baseCellBean = null;
                        }
                        if (i6 < size - 2) {
                            baseCellBean2 = (BaseCellBean) tg3.a(tg3.this).get(i6 + 2);
                        } else {
                            baseCellBean2 = null;
                        }
                        if (baseCellBean != null && baseCellBean.isSectionClip()) {
                            rect.set(0, i7, 0, i4);
                            i9 = baseCellBean.ownedSectionStyle.c();
                            muiseCellBean = muiseCellBean3;
                        } else if (baseCellBean2 != null && baseCellBean2.isSectionClip()) {
                            rect2.set(0, i7, 0, i4);
                            muiseCellBean2 = muiseCellBean3;
                        }
                        if (!(muiseCellBean == null || muiseCellBean2 == null || (abs = Math.abs(rect.bottom - rect2.bottom)) < i9)) {
                            if (rect.bottom > rect2.bottom) {
                                muiseCellBean.clipHeight = abs;
                            } else {
                                muiseCellBean2.clipHeight = abs;
                            }
                        }
                        i7 = i3;
                        i8 = i2;
                        i = 1;
                        i6 += i;
                        i5 = 0;
                    }
                }
                i6 += i;
                i5 = 0;
            }
            tg3.e(tg3.this).t();
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!c()) {
                try {
                    d();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void t();
    }

    static {
        t2o.a(993002091);
    }

    public tg3(c cVar, HandlerThread handlerThread, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar) {
        this.d = cVar;
        if (handlerThread == null) {
            c4p.m("CellLayoutHelper", "handlerThread为 null，将无法触发瀑布流底部对齐功能");
            return;
        }
        handlerThread.start();
        this.f28700a = new Handler(handlerThread.getLooper());
        this.f = acxVar;
    }

    public static /* synthetic */ List a(tg3 tg3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("49ad21cf", new Object[]{tg3Var});
        }
        return tg3Var.b;
    }

    public static /* synthetic */ boolean b(tg3 tg3Var, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("818d9c14", new Object[]{tg3Var, muiseCellBean})).booleanValue();
        }
        return tg3Var.g(muiseCellBean);
    }

    public static /* synthetic */ int c(tg3 tg3Var, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71508fc4", new Object[]{tg3Var, muiseCellBean})).intValue();
        }
        return tg3Var.f(muiseCellBean);
    }

    public static /* synthetic */ int d(tg3 tg3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e444b008", new Object[]{tg3Var})).intValue();
        }
        return tg3Var.c;
    }

    public static /* synthetic */ c e(tg3 tg3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f9389e71", new Object[]{tg3Var});
        }
        return tg3Var.d;
    }

    public final int f(MuiseCellBean muiseCellBean) {
        TemplateBean template;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("772128fb", new Object[]{this, muiseCellBean})).intValue();
        }
        acx<? extends o02<? extends BaseSearchResult, ?>> acxVar = this.f;
        if (acxVar == null || acxVar.e() == null || (template = this.f.e().getTemplate(muiseCellBean.mMuiseBean.type)) == null) {
            return -1;
        }
        return template.midHeight;
    }

    public final boolean g(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16537dae", new Object[]{this, muiseCellBean})).booleanValue();
        }
        if (muiseCellBean.isSection || muiseCellBean.isFullspan || muiseCellBean.comboFullSpan) {
            return true;
        }
        asi asiVar = muiseCellBean.combo;
        if (asiVar != null && asiVar.p() == ListStyle.LIST) {
            return true;
        }
        Object obj = muiseCellBean.mExtraObj.get("fullSpan");
        if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            return false;
        }
        return true;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8707ebd2", new Object[]{this});
            return;
        }
        List<BaseCellBean> list = this.b;
        if (list != null && !list.isEmpty()) {
            b bVar = this.e;
            if (bVar != null) {
                b.a(bVar);
                this.e = null;
            }
            b bVar2 = new b();
            this.e = bVar2;
            this.f28700a.post(bVar2);
        }
    }

    public void i(List<BaseCellBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac305f80", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            this.b = arrayList;
            arrayList.addAll(list);
            h();
        }
    }
}
