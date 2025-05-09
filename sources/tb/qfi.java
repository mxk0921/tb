package tb;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLiveAnimatedView;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLiveOpenCardView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qfi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String e = qfi.class.getSimpleName();
    public final int c;

    /* renamed from: a  reason: collision with root package name */
    public volatile List<h> f26721a = new ArrayList();
    public volatile List<h> b = new ArrayList();
    public final Handler d = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f26722a;

        public a(h hVar) {
            this.f26722a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            qfi.a(qfi.this, this.f26722a);
            TBLiveAnimatedView tBLiveAnimatedView = this.f26722a.e;
            if (tBLiveAnimatedView != null) {
                tBLiveAnimatedView.onVisible();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements qlr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBLiveOpenCardView f26723a;

        public b(qfi qfiVar, TBLiveOpenCardView tBLiveOpenCardView) {
            this.f26723a = tBLiveOpenCardView;
        }

        @Override // tb.qlr
        public void onError(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            } else {
                r0h.b(qfi.b(), "playNew onError");
            }
        }

        @Override // tb.qlr
        public void onInfo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
                return;
            }
            if (i == 100005) {
                this.f26723a.showAtmosphereView();
            }
            r0h.b(qfi.b(), "playNew onInfo");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements rlr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(qfi qfiVar) {
        }

        @Override // tb.rlr
        public void onMediaError(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.rlr
        public void onMediaInfo(long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Comparator<h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(qfi qfiVar) {
        }

        /* renamed from: a */
        public int compare(h hVar, h hVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff105719", new Object[]{this, hVar, hVar2})).intValue();
            }
            return -Integer.compare(hVar.f26724a, hVar2.f26724a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Comparator<h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(qfi qfiVar) {
        }

        /* renamed from: a */
        public int compare(h hVar, h hVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff105719", new Object[]{this, hVar, hVar2})).intValue();
            }
            return -Integer.compare(hVar.f26724a, hVar2.f26724a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Comparator<h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(qfi qfiVar) {
        }

        /* renamed from: a */
        public int compare(h hVar, h hVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff105719", new Object[]{this, hVar, hVar2})).intValue();
            }
            return Integer.compare(hVar.f26724a, hVar2.f26724a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Comparator<h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(qfi qfiVar) {
        }

        /* renamed from: a */
        public int compare(h hVar, h hVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff105719", new Object[]{this, hVar, hVar2})).intValue();
            }
            return Integer.compare(hVar.f26724a, hVar2.f26724a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public int f26724a;
        public int b;
        public float c;
        public TBLiveOpenCardView d;
        public TBLiveAnimatedView e;

        static {
            t2o.a(310378697);
        }
    }

    static {
        t2o.a(310378689);
    }

    public qfi(int i) {
        this.c = i;
    }

    public static /* synthetic */ void a(qfi qfiVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73e44c2", new Object[]{qfiVar, hVar});
        } else {
            qfiVar.l(hVar);
        }
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return e;
    }

    public synchronized void c(RecyclerView recyclerView, b0h b0hVar, String str, int i, int i2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219b1b52", new Object[]{this, recyclerView, b0hVar, str, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
        } else if (b0hVar != null) {
            f(this.b, i, i2);
            f(this.f26721a, i, i2);
            ArrayList<h> arrayList = new ArrayList<>();
            ArrayList<h> arrayList2 = new ArrayList<>();
            m(recyclerView, arrayList, arrayList2, i, i2, z);
            d(arrayList, true, z2, b0hVar, str);
            if (!p0.h(b0hVar.t(), str)) {
                d(arrayList2, false, z2, b0hVar, str);
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void f(List<h> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea42d15", new Object[]{this, list, new Integer(i), new Integer(i2)});
        } else if (list != null && list.size() > 0) {
            ListIterator<h> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                h next = listIterator.next();
                int i3 = next.b;
                if (i3 < i || i3 > i2) {
                    listIterator.remove();
                    TBLiveOpenCardView tBLiveOpenCardView = next.d;
                    if (tBLiveOpenCardView != null) {
                        tBLiveOpenCardView.destroy();
                    }
                    TBLiveAnimatedView tBLiveAnimatedView = next.e;
                    if (tBLiveAnimatedView != null) {
                        tBLiveAnimatedView.onInVisible();
                    }
                }
            }
        }
    }

    public final void g(List<h> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa9613f", new Object[]{this, list});
        } else if (list != null && list.size() > 0) {
            ListIterator<h> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                h next = listIterator.next();
                listIterator.remove();
                TBLiveOpenCardView tBLiveOpenCardView = next.d;
                if (tBLiveOpenCardView != null) {
                    tBLiveOpenCardView.destroy();
                }
                TBLiveAnimatedView tBLiveAnimatedView = next.e;
                if (tBLiveAnimatedView != null) {
                    tBLiveAnimatedView.onInVisible();
                }
            }
        }
    }

    public void i(DXRootView dXRootView) {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("604f9433", new Object[]{this, dXRootView});
        } else if (dXRootView != null) {
            try {
                ArrayList<h> arrayList = new ArrayList<>();
                j(dXRootView, arrayList, new ArrayList<>());
                if (arrayList.size() > 0 && (hVar = arrayList.get(0)) != null) {
                    TBLiveOpenCardView tBLiveOpenCardView = hVar.d;
                    if (tBLiveOpenCardView != null) {
                        tBLiveOpenCardView.destroy();
                    }
                    TBLiveAnimatedView tBLiveAnimatedView = hVar.e;
                    if (tBLiveAnimatedView != null) {
                        tBLiveAnimatedView.onInVisible();
                    }
                }
                if (((ArrayList) this.f26721a).size() > 0) {
                    DinamicDataObject dinamicDataObject = (DinamicDataObject) dXRootView.getTag(R.id.live_feedback_tag);
                    ListIterator listIterator = ((ArrayList) this.f26721a).listIterator();
                    while (listIterator.hasNext()) {
                        if (((h) listIterator.next()).b == dinamicDataObject.mPosition) {
                            listIterator.remove();
                        }
                    }
                }
            } catch (Exception e2) {
                String str = e;
                r0h.b(str, "destroyCardPlayer" + e2.getMessage());
            }
        }
    }

    public final void j(View view, ArrayList<h> arrayList, ArrayList<h> arrayList2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ce2e82", new Object[]{this, view, arrayList, arrayList2});
        } else if (view != null && arrayList != null && arrayList2 != null) {
            h hVar = new h();
            h hVar2 = new h();
            if (view instanceof TBLiveOpenCardView) {
                hVar.d = (TBLiveOpenCardView) view;
                arrayList.add(hVar);
            }
            if (view instanceof TBLiveAnimatedView) {
                hVar2.e = (TBLiveAnimatedView) view;
                arrayList2.add(hVar2);
            }
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i < viewGroup.getChildCount()) {
                        j(viewGroup.getChildAt(i), arrayList, arrayList2);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public float k(View view) {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3c79284", new Object[]{this, view})).floatValue();
        }
        if (view == null || (height = view.getHeight()) == 0) {
            return 0.0f;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.top != 0 || height <= this.c + rect.height()) {
            return rect.height() / height;
        }
        return 0.0f;
    }

    public void m(RecyclerView recyclerView, ArrayList<h> arrayList, ArrayList<h> arrayList2, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5412e11d", new Object[]{this, recyclerView, arrayList, arrayList2, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (recyclerView != null && arrayList != null && arrayList2 != null) {
            while (i <= i2) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition != null) {
                    View view = findViewHolderForAdapterPosition.itemView;
                    ArrayList<h> arrayList3 = new ArrayList<>();
                    ArrayList<h> arrayList4 = new ArrayList<>();
                    j(view, arrayList3, arrayList4);
                    if (arrayList3.size() > 0 && view != null) {
                        Rect rect = new Rect();
                        view.getGlobalVisibleRect(rect);
                        int i3 = rect.top;
                        h hVar = arrayList3.get(0);
                        hVar.b = i;
                        hVar.f26724a = i3;
                        hVar.c = k(view);
                        if (arrayList4.size() > 0 && arrayList4.get(0) != null) {
                            hVar.e = arrayList4.get(0).e;
                        }
                        arrayList.add(hVar);
                    }
                    if (arrayList4.size() > 0 && view != null) {
                        Rect rect2 = new Rect();
                        view.getGlobalVisibleRect(rect2);
                        int i4 = rect2.top;
                        h hVar2 = arrayList4.get(0);
                        hVar2.b = i;
                        hVar2.f26724a = i4;
                        hVar2.c = k(view);
                        arrayList2.add(hVar2);
                    }
                }
                i++;
            }
            if (z) {
                Collections.sort(arrayList, new d(this));
                Collections.sort(arrayList2, new e(this));
                return;
            }
            Collections.sort(arrayList, new f(this));
            Collections.sort(arrayList2, new g(this));
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373b1d8f", new Object[]{this});
            return;
        }
        g(this.f26721a);
        g(this.b);
        bjr.d().c(zzg.PLAY_PAGEID, false);
    }

    public final void l(h hVar) {
        TBLiveOpenCardView tBLiveOpenCardView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59471eba", new Object[]{this, hVar});
        } else if (hVar != null && (tBLiveOpenCardView = hVar.d) != null && !tBLiveOpenCardView.isPlaying()) {
            tBLiveOpenCardView.setPageId(zzg.PLAY_PAGEID);
            tBLiveOpenCardView.setSubBusinessType(zzg.PLAY_SUBBUSINESS_TYPE);
            if (e2h.o()) {
                tBLiveOpenCardView.setCloseSkipPlaySwitch(true);
            }
            tBLiveOpenCardView.setEnableCoverFade(true);
            tBLiveOpenCardView.setAnimateTime(e2h.e());
            tBLiveOpenCardView.setPlayDuration(0);
            tBLiveOpenCardView.setVideoLoop(true);
            tBLiveOpenCardView.playVideo(new b(this, tBLiveOpenCardView), new c(this));
        }
    }

    public final void d(ArrayList<h> arrayList, boolean z, boolean z2, b0h b0hVar, String str) {
        TBLiveOpenCardView tBLiveOpenCardView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc8caf", new Object[]{this, arrayList, new Boolean(z), new Boolean(z2), b0hVar, str});
            return;
        }
        boolean i = b0hVar != null ? p0.i("", b0hVar.t(), str) : false;
        if (arrayList != null && arrayList.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                h hVar = arrayList.get(i2);
                if (hVar.c < 1.0d) {
                    if (!z) {
                        TBLiveAnimatedView tBLiveAnimatedView = hVar.e;
                        if (tBLiveAnimatedView != null) {
                            tBLiveAnimatedView.onInVisible();
                            ListIterator listIterator = ((ArrayList) this.b).listIterator();
                            while (listIterator.hasNext()) {
                                if (((h) listIterator.next()).b == hVar.b) {
                                    listIterator.remove();
                                }
                            }
                        }
                    } else if (!z2 && (tBLiveOpenCardView = hVar.d) != null && tBLiveOpenCardView.isPlaying()) {
                        String str2 = e;
                        r0h.b(str2, "playNew allowDestroy,pos：" + hVar.b);
                        tBLiveOpenCardView.destroy();
                        TBLiveAnimatedView tBLiveAnimatedView2 = hVar.e;
                        if (tBLiveAnimatedView2 != null) {
                            tBLiveAnimatedView2.onInVisible();
                        }
                        ListIterator listIterator2 = ((ArrayList) this.f26721a).listIterator();
                        while (listIterator2.hasNext()) {
                            if (((h) listIterator2.next()).b == hVar.b) {
                                listIterator2.remove();
                            }
                        }
                    }
                } else if (z) {
                    if (((ArrayList) this.f26721a).size() < (i ? nvs.p0() : 2) && hVar.c >= 1.0d) {
                        String str3 = e;
                        r0h.b(str3, "startPlay onInfo,pos：" + hVar.b);
                        if (!z2 || !i) {
                            if (i) {
                                if ((((ArrayList) this.f26721a).size() == 1 && ((h) ((ArrayList) this.f26721a).get(0)).b != hVar.b) || ((ArrayList) this.f26721a).size() == 0) {
                                    ((ArrayList) this.f26721a).add(hVar);
                                }
                                this.d.postDelayed(new a(hVar), nvs.s0());
                            } else {
                                l(hVar);
                                if ((((ArrayList) this.f26721a).size() == 1 && ((h) ((ArrayList) this.f26721a).get(0)).b != hVar.b) || ((ArrayList) this.f26721a).size() == 0) {
                                    ((ArrayList) this.f26721a).add(hVar);
                                }
                            }
                        }
                    }
                } else if (((ArrayList) this.b).size() <= 1 && hVar.c >= 1.0d) {
                    String str4 = e;
                    r0h.b(str4, "startImg onInfo,pos：" + hVar.b);
                    TBLiveAnimatedView tBLiveAnimatedView3 = hVar.e;
                    if (tBLiveAnimatedView3 != null) {
                        tBLiveAnimatedView3.onVisible();
                        if ((((ArrayList) this.b).size() == 1 && ((h) ((ArrayList) this.b).get(0)).b != hVar.b) || ((ArrayList) this.b).size() == 0) {
                            ((ArrayList) this.b).add(hVar);
                        }
                    }
                }
            }
        }
    }
}
