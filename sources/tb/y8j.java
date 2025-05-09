package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ugc.uploader.UploaderTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y8j implements mzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x8j f31909a;
    public final x6e b;
    public final List<UploaderTask> c;
    public boolean d;
    public int e;
    public final int f;
    public final List<a> g = new ArrayList();
    public final int[] h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Comparable<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public z6e f31910a;
        public ozd b;
        public int c;

        static {
            t2o.a(758120529);
        }

        public a() {
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e328a070", new Object[]{this, aVar})).intValue();
            }
            return this.c - aVar.c;
        }
    }

    static {
        t2o.a(758120528);
    }

    public y8j(x6e x6eVar, List<UploaderTask> list, x8j x8jVar) {
        this.f31909a = x8jVar;
        this.b = x6eVar;
        this.c = list;
        int size = list.size();
        this.f = size;
        this.h = new int[size];
    }

    @Override // tb.mzd
    public void onCancel(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d021ed", new Object[]{this, z6eVar});
        }
    }

    @Override // tb.mzd
    public void onFailure(z6e z6eVar, ndt ndtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
            return;
        }
        for (UploaderTask uploaderTask : this.c) {
            this.b.cancelAsync(uploaderTask);
        }
        z6eVar.getFilePath();
        Objects.toString(ndtVar);
        this.f31909a.b(ndtVar);
    }

    @Override // tb.mzd
    public void onPause(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85aa60f", new Object[]{this, z6eVar});
        }
    }

    @Override // tb.mzd
    public void onProgress(z6e z6eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b23fa9", new Object[]{this, z6eVar, new Integer(i)});
            return;
        }
        synchronized (this) {
            try {
                int indexOf = this.c.indexOf(z6eVar);
                int[] iArr = this.h;
                iArr[indexOf] = i;
                int i2 = 0;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                ((w8j) this.f31909a).c(i2 / this.f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tb.mzd
    public void onResume(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e581d4da", new Object[]{this, z6eVar});
        }
    }

    @Override // tb.mzd
    public void onStart(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33e623", new Object[]{this, z6eVar});
        } else if (!this.d) {
            synchronized (this) {
                try {
                    if (!this.d) {
                        ((w8j) this.f31909a).d();
                        this.d = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.mzd
    public void onSuccess(z6e z6eVar, ozd ozdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
            return;
        }
        synchronized (this) {
            try {
                this.e++;
                z6eVar.getFilePath();
                ozdVar.a();
                a aVar = new a();
                aVar.f31910a = z6eVar;
                aVar.b = ozdVar;
                aVar.c = this.c.indexOf(z6eVar);
                ((ArrayList) this.g).add(aVar);
                if (this.e == this.f) {
                    Collections.sort(this.g);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = ((ArrayList) this.g).iterator();
                    while (it.hasNext()) {
                        a aVar2 = (a) it.next();
                        arrayList2.add(aVar2.f31910a);
                        arrayList.add(aVar2.b);
                    }
                    this.f31909a.a(arrayList2, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tb.mzd
    public void onWait(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e24ed2", new Object[]{this, z6eVar});
        }
    }
}
