package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l56 extends an6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXSCROLLERLAYOUT_ENABLESMOOTHSCROLL = 7492731803194590965L;
    public static final long DXSCROLLERLAYOUT_OPENSCROLLERANIMATION = -7123870390816445523L;
    public static final long DX_SCROLLER_LAYOUT_CONTENT_OFFSET = 1750803361827314031L;
    public static final long DX_SCROLL_LAYOUT_BASE_INDICATOR_ID = 7196296497982840181L;
    public static final long DX_SCROLL_LAYOUT_BASE_SHOW_INDICATOR = -3765027987112450965L;
    public static final long DX_SLIDER_LAYOUT_AUTO_SCROLL = 2618773720063865426L;
    public static final long DX_SLIDER_LAYOUT_AUTO_SCROLL_INTERVAL = 5501313022839937951L;
    public static final long DX_SLIDER_LAYOUT_IS_INFINITE = -3537170322378136036L;
    public static final long DX_SLIDER_LAYOUT_PAGE_INDEX = 7816489696776271262L;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public boolean b;
    public String c;
    public boolean e;
    public boolean i;

    /* renamed from: a  reason: collision with root package name */
    public int f23117a = -1;
    public boolean d = true;
    public int f = 0;
    public int g = 0;
    public boolean h = false;
    public int j = 1000;

    static {
        t2o.a(444596464);
    }

    public static /* synthetic */ Object ipc$super(l56 l56Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1764761226) {
            super.b((fae) objArr[0]);
            return null;
        } else if (hashCode == 111792625) {
            super.d(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1589527152) {
            super.g(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamic_v35/widget/DXNanoScrollerLayoutProps");
        }
    }

    @Override // tb.an6, tb.fae
    public void b(fae faeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96cfe176", new Object[]{this, faeVar});
            return;
        }
        super.b(faeVar);
        l56 l56Var = (l56) faeVar;
        this.c = l56Var.c;
        this.d = l56Var.d;
        this.f23117a = l56Var.f23117a;
        this.b = l56Var.b;
        this.e = l56Var.e;
        this.f = l56Var.f;
        this.g = l56Var.g;
        this.h = l56Var.h;
        this.i = l56Var.i;
        this.j = l56Var.j;
    }

    @Override // tb.an6, tb.fae
    public void d(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a9d1f1", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 2618773720063865426L) {
            if (i == 0) {
                z = false;
            }
            this.i = z;
        } else if (j == 5501313022839937951L) {
            this.j = Math.max(0, i);
        } else if (j == -3765027987112450965L) {
            if (i == 0) {
                z = false;
            }
            this.d = z;
        } else if (j == 1750803361827314031L) {
            this.f23117a = i;
        } else if (j == 7492731803194590965L) {
            if (i == 0) {
                z = false;
            }
            this.b = z;
        } else if (j == -7123870390816445523L) {
            if (i == 0) {
                z = false;
            }
            this.e = z;
        } else if (j == 7816489696776271262L) {
            this.f = Math.max(0, i);
        } else if (-7199229155167727177L == j) {
            this.g = i;
        } else if (j == -3537170322378136036L) {
            if (i == 0) {
                z = false;
            }
            this.h = z;
        } else {
            super.d(j, i);
        }
    }

    @Override // tb.an6, tb.fae
    public void g(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ebe4270", new Object[]{this, new Long(j), str});
        } else if (j == 7196296497982840181L) {
            this.c = str;
        } else {
            super.g(j, str);
        }
    }
}
