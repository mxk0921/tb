package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.service.TppParamFeedInfo;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ijw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<jjw> f21358a = new ArrayList<>();
    public TppParamFeedInfo b = null;
    public final int c = pvs.E2();

    static {
        t2o.a(779093234);
    }

    public void a(TppParamFeedInfo tppParamFeedInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4ba3e0", new Object[]{this, tppParamFeedInfo});
            return;
        }
        TppParamFeedInfo tppParamFeedInfo2 = this.b;
        if (!(tppParamFeedInfo2 == null || (str = tppParamFeedInfo2.liveId) == null)) {
            jjw e = e(str);
            if (e == null) {
                e = new jjw(this.b.liveId);
                this.f21358a.add(e);
                if (this.f21358a.size() > this.c) {
                    this.f21358a.remove(0);
                }
            }
            e.b.add(this.b);
        }
        this.b = tppParamFeedInfo;
    }

    public TppParamFeedInfo b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TppParamFeedInfo) ipChange.ipc$dispatch("7e6b132d", new Object[]{this, str});
        }
        TppParamFeedInfo tppParamFeedInfo = this.b;
        if (tppParamFeedInfo != null && TextUtils.equals(str, tppParamFeedInfo.liveId)) {
            return this.b;
        }
        jjw e = e(str);
        if (e == null || e.b.isEmpty()) {
            return null;
        }
        ArrayList<TppParamFeedInfo> arrayList = e.b;
        return arrayList.get(arrayList.size() - 1);
    }

    public ArrayList<TppParamFeedInfo> c() {
        TppParamFeedInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f5f53951", new Object[]{this});
        }
        ArrayList<TppParamFeedInfo> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f21358a.size(); i++) {
            jjw jjwVar = this.f21358a.get(i);
            if (!(jjwVar == null || (a2 = jjwVar.a()) == null)) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public ArrayList<TppParamFeedInfo> d(int i) {
        TppParamFeedInfo a2;
        TppParamFeedInfo a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c33f10c6", new Object[]{this, new Integer(i)});
        }
        if (i < 0) {
            i = this.f21358a.size();
        }
        ArrayList<TppParamFeedInfo> arrayList = new ArrayList<>();
        int size = this.f21358a.size();
        if (i >= size) {
            for (int i2 = 0; i2 < size; i2++) {
                jjw jjwVar = this.f21358a.get(i2);
                if (!(jjwVar == null || (a3 = jjwVar.a()) == null)) {
                    arrayList.add(a3);
                }
            }
        } else {
            for (int i3 = size - i; i3 < size; i3++) {
                jjw jjwVar2 = this.f21358a.get(i3);
                if (!(jjwVar2 == null || (a2 = jjwVar2.a()) == null)) {
                    arrayList.add(a2);
                }
            }
        }
        TppParamFeedInfo tppParamFeedInfo = this.b;
        if (tppParamFeedInfo != null) {
            if (tppParamFeedInfo.enter > 0) {
                tppParamFeedInfo.stay = System.currentTimeMillis() - this.b.enter;
            }
            arrayList.add(this.b);
        }
        return arrayList;
    }

    public final jjw e(String str) {
        ArrayList<jjw> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jjw) ipChange.ipc$dispatch("d7251d64", new Object[]{this, str});
        }
        if (!(str == null || (arrayList = this.f21358a) == null || arrayList.size() <= 0)) {
            for (int size = this.f21358a.size() - 1; size >= 0; size--) {
                jjw jjwVar = this.f21358a.get(size);
                String str2 = jjwVar.f22033a;
                if (str2 != null && str2.equals(str)) {
                    return jjwVar;
                }
            }
        }
        return null;
    }
}
