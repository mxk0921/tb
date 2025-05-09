package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Object b = new Object();
    public static nmi c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, ArrayList<WeakReference<mmi>>> f24827a = new HashMap<>();

    public nmi(Context context) {
    }

    public static nmi a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmi) ipChange.ipc$dispatch("1df4d790", new Object[]{context});
        }
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new nmi(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void b(mmi mmiVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a351083", new Object[]{this, mmiVar, obj});
            return;
        }
        synchronized (this.f24827a) {
            try {
                if (mmiVar != null) {
                    ArrayList<WeakReference<mmi>> arrayList = this.f24827a.get(mmiVar.b());
                    if (arrayList != null) {
                        try {
                            Iterator<WeakReference<mmi>> it = arrayList.iterator();
                            while (it.hasNext()) {
                                mmi mmiVar2 = it.next().get();
                                if (!(mmiVar2 == null || mmiVar2 == mmiVar)) {
                                    mmiVar2.c(obj);
                                }
                            }
                        } catch (Exception e) {
                            Log.e("MessageChannelManager", e.getMessage());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68300307", new Object[]{this, str, obj});
            return;
        }
        synchronized (this.f24827a) {
            ArrayList<WeakReference<mmi>> arrayList = this.f24827a.get(str);
            if (arrayList != null) {
                try {
                    Iterator<WeakReference<mmi>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        mmi mmiVar = it.next().get();
                        if (mmiVar != null) {
                            mmiVar.c(obj);
                        }
                    }
                } catch (Exception e) {
                    Log.e("MessageChannelManager", e.getMessage());
                }
            }
        }
    }

    public void d(mmi mmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8c47c3", new Object[]{this, mmiVar});
            return;
        }
        synchronized (this.f24827a) {
            try {
                if (mmiVar != null) {
                    ArrayList<WeakReference<mmi>> arrayList = this.f24827a.get(mmiVar.b());
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        this.f24827a.put(mmiVar.b(), arrayList);
                    }
                    arrayList.add(new WeakReference<>(mmiVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(mmi mmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c83b75c", new Object[]{this, mmiVar});
            return;
        }
        synchronized (this.f24827a) {
            try {
                if (mmiVar != null) {
                    ArrayList<WeakReference<mmi>> arrayList = this.f24827a.get(mmiVar.b());
                    if (arrayList != null) {
                        Iterator<WeakReference<mmi>> it = arrayList.iterator();
                        while (it.hasNext()) {
                            mmi mmiVar2 = it.next().get();
                            if (mmiVar2 == null || mmiVar2 == mmiVar) {
                                it.remove();
                            }
                        }
                        if (arrayList.size() == 0) {
                            this.f24827a.remove(mmiVar.b());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
