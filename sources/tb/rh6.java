package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXViewPager;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.tao.log.TLog;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.l00;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rh6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLVNATIVECALLCHAIN = -9101150660281637999L;
    public static final String b = rh6.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public List<Integer> f27381a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements qlr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(rh6 rh6Var) {
        }

        @Override // tb.qlr
        public void onError(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.qlr
        public void onInfo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements rlr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(rh6 rh6Var) {
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
    public class c implements l00.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(rh6 rh6Var) {
        }

        @Override // tb.l00.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89270fbb", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements l00.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(rh6 rh6Var) {
        }

        @Override // tb.l00.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89270fbb", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements qlr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l00.b f27382a;

        public e(rh6 rh6Var, l00.b bVar) {
            this.f27382a = bVar;
        }

        @Override // tb.qlr
        public void onError(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.qlr
        public void onInfo(int i) {
            l00.b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
            } else if (i == 100003 && (bVar = this.f27382a) != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements rlr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(rh6 rh6Var) {
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

    static {
        t2o.a(310378549);
    }

    public static /* synthetic */ Object ipc$super(rh6 rh6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/DXTblvNativeCallChainEventHandler");
    }

    public void a(DXRuntimeContext dXRuntimeContext, String str, String str2, String str3, String str4, Integer num, int i, myg mygVar, boolean z, int i2, boolean z2) {
        String str5;
        DXWidgetNode queryWidgetNodeByUserId;
        DXRecyclerLayout dXRecyclerLayout;
        RecyclerView j0;
        ViewPager W;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6041d", new Object[]{this, dXRuntimeContext, str, str2, str3, str4, num, new Integer(i), mygVar, new Boolean(z), new Integer(i2), new Boolean(z2)});
            return;
        }
        int i3 = i2;
        if (!sj7.a() && dXRuntimeContext != null) {
            if (!lrq.a(str2) && !lrq.a(str4)) {
                DXWidgetNode queryWidgetNodeByUserId2 = dXRuntimeContext.L().getExpandWidgetNode().queryWidgetNodeByUserId(str2);
                if ((queryWidgetNodeByUserId2 instanceof DXViewPager) && (W = ((DXViewPager) queryWidgetNodeByUserId2).W()) != null) {
                    str5 = str4 + W.getCurrentItem();
                    queryWidgetNodeByUserId = dXRuntimeContext.L().getExpandWidgetNode().queryWidgetNodeByUserId(str5);
                    if ((queryWidgetNodeByUserId instanceof DXRecyclerLayout) && (j0 = (dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId).j0()) != null && (j0.getLayoutManager() instanceof StaggeredGridLayoutManager)) {
                        int p = dXRecyclerLayout.l0().p();
                        double r = dXRecyclerLayout.l0().r();
                        if (!z) {
                            int i4 = i(p, "" + str + str5 + "offsetY", mygVar);
                            if (p != 0 || i4 == 0) {
                                i3 = i4;
                            } else {
                                return;
                            }
                        } else if (p != 0) {
                            return;
                        }
                        List<Object> x = dXRecyclerLayout.x();
                        if (x != null && x.size() > 0) {
                            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) j0.getLayoutManager();
                            int intValue = num != null ? num.intValue() : 2;
                            int[] iArr = new int[intValue];
                            int[] iArr2 = new int[intValue];
                            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
                            staggeredGridLayoutManager.findLastVisibleItemPositions(iArr2);
                            String str6 = "" + str;
                            if (!"old".equals(mygVar.h())) {
                                int i5 = intValue - 1;
                                k(j0, str6, Math.min(iArr[0], iArr[i5]), Math.max(iArr2[0], iArr2[i5]), x, i, i3, mygVar, z2, r);
                                return;
                            }
                            int i6 = intValue - 1;
                            j(j0, str6, Math.min(iArr[0], iArr[i6]), Math.max(iArr2[0], iArr2[i6]), x, i, i3, mygVar, dXRuntimeContext.h());
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            str5 = str3;
            queryWidgetNodeByUserId = dXRuntimeContext.L().getExpandWidgetNode().queryWidgetNodeByUserId(str5);
            if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
            }
        }
    }

    public final ArrayList<tlc> b(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f7c7219c", new Object[]{this, view});
        }
        ArrayList<tlc> arrayList = new ArrayList<>();
        if (view != null) {
            if (view instanceof tlc) {
                arrayList.add((tlc) view);
            }
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    ArrayList<tlc> b2 = b(viewGroup.getChildAt(i));
                    if (!b2.isEmpty()) {
                        arrayList.addAll(b2);
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    public float c(View view, int i) {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c52b32df", new Object[]{this, view, new Integer(i)})).floatValue();
        }
        if (view == null || (height = view.getHeight()) == 0) {
            return 0.0f;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.top != 0 || height <= i + rect.height()) {
            return rect.height() / height;
        }
        return 0.0f;
    }

    public void f(String str, int i, myg mygVar) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58cc6d8b", new Object[]{this, str, new Integer(i), mygVar});
            return;
        }
        String str2 = str + "playViewPos";
        if (mygVar.i() == null) {
            map = new HashMap<>();
        } else {
            map = mygVar.i();
        }
        map.put(str2, Integer.valueOf(i));
        mygVar.n(map);
    }

    public List<Integer> g(String str, int i, myg mygVar) {
        Map<String, Object> map;
        List<Integer> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b732c55e", new Object[]{this, str, new Integer(i), mygVar});
        }
        PrintStream printStream = System.out;
        printStream.println("shanxia,:" + i);
        if (mygVar.i() == null) {
            map = new HashMap<>();
        } else {
            map = mygVar.i();
        }
        if (map.get(str) == null) {
            list = new ArrayList<>();
        } else {
            list = (List) map.get(str);
        }
        list.add(Integer.valueOf(i));
        map.put(str, list);
        mygVar.n(map);
        return list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0218  */
    @Override // tb.ob5, tb.mvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r26, java.lang.Object[] r27, com.taobao.android.dinamicx.DXRuntimeContext r28) {
        /*
            Method dump skipped, instructions count: 1844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rh6.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    public final int i(int i, String str, myg mygVar) {
        Map<String, Object> map;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50b24293", new Object[]{this, new Integer(i), str, mygVar})).intValue();
        }
        if (mygVar.i() == null) {
            map = new HashMap<>();
        } else {
            map = mygVar.i();
        }
        if (map.get(str) instanceof Integer) {
            i2 = ((Integer) map.get(str)).intValue();
        }
        map.put(str, Integer.valueOf(i));
        mygVar.n(map);
        return i - i2;
    }

    public final void k(RecyclerView recyclerView, String str, int i, int i2, List<Object> list, int i3, int i4, myg mygVar, boolean z, double d2) {
        String str2;
        int i5;
        int adapterPosition;
        int adapterPosition2;
        RecyclerView recyclerView2 = recyclerView;
        int i6 = i;
        int i7 = i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fcc068f", new Object[]{this, recyclerView2, str, new Integer(i6), new Integer(i7), list, new Integer(i3), new Integer(i4), mygVar, new Boolean(z), new Double(d2)});
        } else if (mygVar != null && list != null && list.size() != 0) {
            String str3 = str + "playViewPosList";
            Map<String, Object> hashMap = mygVar.i() == null ? new HashMap<>() : mygVar.i();
            if (hashMap.get(str3) instanceof List) {
                this.f27381a = (List) hashMap.get(str3);
            }
            String h = mygVar.h();
            try {
                if (this.f27381a != null) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= this.f27381a.size()) {
                            break;
                        }
                        Integer num = this.f27381a.get(i8);
                        int intValue = num.intValue();
                        RecyclerView.ViewHolder findViewHolderForLayoutPosition = recyclerView2.findViewHolderForLayoutPosition(intValue);
                        if (findViewHolderForLayoutPosition == null) {
                            bjr.d().c(zzg.PLAY_PAGEID, false);
                            this.f27381a = new ArrayList();
                            break;
                        }
                        ArrayList<tlc> b2 = b(findViewHolderForLayoutPosition.itemView);
                        if (b2.size() > 0) {
                            tlc tlcVar = b2.get(0);
                            if (intValue >= i6) {
                                if (intValue > i7) {
                                }
                            }
                            tlcVar.destroy();
                            this.f27381a.remove(num);
                        }
                        i8++;
                        recyclerView2 = recyclerView;
                    }
                    hashMap.put(str3, this.f27381a);
                    mygVar.n(hashMap);
                }
                str2 = "two";
            } catch (Exception unused) {
                TLog.loge(b, "dx video startPlay exception!!!");
            }
            if (!z || (d2 <= nvs.i0() && !h.equals(str2))) {
                String str4 = "scrollAndTwo";
                if (i4 < 0) {
                    while (i7 >= i6) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i7);
                        if (findViewHolderForAdapterPosition != null && (adapterPosition2 = findViewHolderForAdapterPosition.getAdapterPosition()) < list.size()) {
                            if (list.get(adapterPosition2) instanceof JSONObject) {
                                float c2 = c(findViewHolderForAdapterPosition.itemView, i3);
                                ArrayList<tlc> b3 = b(findViewHolderForAdapterPosition.itemView);
                                if (b3.size() > 0) {
                                    tlc tlcVar2 = b3.get(0);
                                    if (tlcVar2.isPlaying()) {
                                        if (c2 < 1.0d && !z) {
                                            tlcVar2.destroy();
                                            this.f27381a.remove(Integer.valueOf(adapterPosition2));
                                            hashMap.put(str3, this.f27381a);
                                            mygVar.n(hashMap);
                                        }
                                    } else if (h.equals(str2)) {
                                        List<Integer> list2 = this.f27381a;
                                        if ((list2 == null || list2.size() <= 1) && c2 >= 1.0d && d(tlcVar2, mygVar, str3, adapterPosition2)) {
                                            this.f27381a = g(str3, adapterPosition2, mygVar);
                                        }
                                    } else {
                                        if (this.f27381a.size() < (h.equals(str4) ? 2 : 1) && c2 >= 1.0d && d(tlcVar2, mygVar, str3, adapterPosition2)) {
                                            this.f27381a = g(str3, adapterPosition2, mygVar);
                                        }
                                    }
                                }
                            }
                        }
                        i7--;
                        i6 = i;
                    }
                } else {
                    int i9 = i;
                    while (i9 <= i7) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(i9);
                        if (findViewHolderForAdapterPosition2 != null && (adapterPosition = findViewHolderForAdapterPosition2.getAdapterPosition()) < list.size() && (list.get(adapterPosition) instanceof JSONObject)) {
                            float c3 = c(findViewHolderForAdapterPosition2.itemView, i3);
                            ArrayList<tlc> b4 = b(findViewHolderForAdapterPosition2.itemView);
                            if (b4.size() > 0) {
                                tlc tlcVar3 = b4.get(0);
                                if (tlcVar3.isPlaying()) {
                                    str4 = str4;
                                    if (c3 < 1.0d && !z) {
                                        tlcVar3.destroy();
                                        this.f27381a.remove(Integer.valueOf(adapterPosition));
                                        hashMap.put(str3, this.f27381a);
                                        mygVar.n(hashMap);
                                    }
                                } else {
                                    str4 = str4;
                                    if (h.equals(str2)) {
                                        List<Integer> list3 = this.f27381a;
                                        if ((list3 == null || list3.size() <= 1) && c3 >= 1.0d && d(tlcVar3, mygVar, str3, adapterPosition)) {
                                            this.f27381a = g(str3, adapterPosition, mygVar);
                                        }
                                    } else {
                                        boolean equals = h.equals(str4);
                                        str2 = str2;
                                        if (this.f27381a.size() < (equals ? 2 : 1)) {
                                            str4 = str4;
                                            if (c3 >= 1.0d && d(tlcVar3, mygVar, str3, adapterPosition)) {
                                                this.f27381a = g(str3, adapterPosition, mygVar);
                                            }
                                            i5 = 1;
                                            i9 += i5;
                                            i7 = i2;
                                        } else {
                                            str4 = str4;
                                            i5 = 1;
                                            i9 += i5;
                                            i7 = i2;
                                        }
                                    }
                                }
                                i5 = 1;
                                str2 = str2;
                                i9 += i5;
                                i7 = i2;
                            }
                        }
                        str2 = str2;
                        str4 = str4;
                        i5 = 1;
                        i9 += i5;
                        i7 = i2;
                    }
                }
                hashMap.put(str3, this.f27381a);
                mygVar.n(hashMap);
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    public final int h(int i, String str, myg mygVar) {
        Map<String, Object> map;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e3d8806", new Object[]{this, new Integer(i), str, mygVar})).intValue();
        }
        if (mygVar == null) {
            return 0;
        }
        String str2 = str + "outerOffsetY";
        if (mygVar.i() == null) {
            map = new HashMap<>();
        } else {
            map = mygVar.i();
        }
        if (map.get(str2) instanceof Integer) {
            i2 = ((Integer) map.get(str2)).intValue();
        }
        map.put(str2, Integer.valueOf(i));
        mygVar.n(map);
        return i - i2;
    }

    public final boolean d(tlc tlcVar, myg mygVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2b4ceb5", new Object[]{this, tlcVar, mygVar, str, new Integer(i)})).booleanValue();
        }
        tlcVar.setPageId(zzg.PLAY_PAGEID);
        tlcVar.setSubBusinessType(zzg.PLAY_SUBBUSINESS_TYPE);
        if (e2h.o()) {
            tlcVar.setCloseSkipPlaySwitch(true);
        }
        tlcVar.setEnableCoverFade(true);
        tlcVar.setAnimateTime(e2h.e());
        tlcVar.setPlayDuration(0);
        tlcVar.setVideoLoop(true);
        return tlcVar.playVideo(new a(this), new b(this));
    }

    public boolean e(View view, JSONObject jSONObject, l00.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0978e8", new Object[]{this, view, jSONObject, bVar})).booleanValue();
        }
        if (!(view == null || jSONObject == null)) {
            ArrayList<tlc> b2 = b(view);
            if (b2.size() > 0) {
                Iterator<tlc> it = b2.iterator();
                while (it.hasNext()) {
                    tlc next = it.next();
                    if (next != null) {
                        if (next.isPlaying()) {
                            return true;
                        }
                        bjr.d().c(zzg.PLAY_PAGEID, false);
                        next.setPageId(zzg.PLAY_PAGEID);
                        next.setSubBusinessType(zzg.PLAY_SUBBUSINESS_TYPE);
                        if (e2h.o()) {
                            next.setCloseSkipPlaySwitch(true);
                        }
                        next.setEnableCoverFade(true);
                        next.setAnimateTime(e2h.e());
                        next.setPlayDuration(0);
                        next.setVideoLoop(true);
                        return next.playVideo(new e(this, bVar), new f(this));
                    }
                }
            }
        }
        return false;
    }

    public final void j(RecyclerView recyclerView, String str, int i, int i2, List<Object> list, int i3, int i4, myg mygVar, Context context) {
        Map<String, Object> map;
        int adapterPosition;
        int adapterPosition2;
        int i5 = i;
        int i6 = i2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c6962f", new Object[]{this, recyclerView, str, new Integer(i5), new Integer(i6), list, new Integer(i3), new Integer(i4), mygVar, context});
        } else if (list != null && list.size() != 0) {
            String str2 = str + "playViewPos";
            if (mygVar.i() == null) {
                map = new HashMap<>();
            } else {
                map = mygVar.i();
            }
            int intValue = map.get(str2) instanceof Integer ? ((Integer) map.get(str2)).intValue() : -1;
            if (intValue > i6 || intValue < i5) {
                bjr.d().c(zzg.PLAY_PAGEID, false);
            }
            double d2 = 1.0d;
            try {
                if (i4 < 0) {
                    while (i6 >= i5) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i6);
                        if (findViewHolderForAdapterPosition == null || z || (adapterPosition2 = findViewHolderForAdapterPosition.getAdapterPosition()) >= list.size() || !(list.get(adapterPosition2) instanceof JSONObject)) {
                            z = z;
                        } else {
                            JSONObject jSONObject = (JSONObject) list.get(adapterPosition2);
                            z = z;
                            if (c(findViewHolderForAdapterPosition.itemView, i3) >= d2 && i6 <= intValue) {
                                if (i6 == intValue) {
                                    int[] iArr = new int[2];
                                    findViewHolderForAdapterPosition.itemView.getLocationOnScreen(iArr);
                                    if (qw0.d(context, mygVar.getHeight()) - ((iArr[1] + findViewHolderForAdapterPosition.itemView.getHeight()) + qw0.d(context, mygVar.f())) < qw0.d(context, 60.0f)) {
                                    }
                                }
                                f(str, i6, mygVar);
                                z = e(findViewHolderForAdapterPosition.itemView, jSONObject, new c(this));
                                i6--;
                                d2 = 1.0d;
                            }
                        }
                        i6--;
                        d2 = 1.0d;
                    }
                    return;
                }
                while (i5 <= i6) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(i5);
                    if (findViewHolderForAdapterPosition2 != null && !z && (adapterPosition = findViewHolderForAdapterPosition2.getAdapterPosition()) < list.size() && (list.get(adapterPosition) instanceof JSONObject)) {
                        JSONObject jSONObject2 = (JSONObject) list.get(adapterPosition);
                        if (c(findViewHolderForAdapterPosition2.itemView, i3) >= 1.0d) {
                            if (i4 > 0) {
                                if (i5 >= intValue) {
                                    if (i5 == intValue) {
                                        int[] iArr2 = new int[2];
                                        findViewHolderForAdapterPosition2.itemView.getLocationOnScreen(iArr2);
                                        if (iArr2[1] < qw0.d(context, i3 + 60)) {
                                        }
                                    }
                                }
                            }
                            f(str, i5, mygVar);
                            z = e(findViewHolderForAdapterPosition2.itemView, jSONObject2, new d(this));
                        }
                    }
                    i5++;
                }
            } catch (Exception unused) {
                TLog.loge(b, "dx video startPlay exception!!!");
            }
        }
    }
}
