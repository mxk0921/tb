package com.taobao.android.a11y.ability.ocr;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.mh4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OCRBatchManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile OCRBatchManager e;
    public b d;
    public final a b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f6248a = new HashMap();
    public BatchStatus c = BatchStatus.BATCH_FIRST_REQUEST;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum BatchStatus {
        BATCH_FIRST_REQUEST,
        BATCH_WAITING,
        BATCH_READY;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(BatchStatus batchStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/a11y/ability/ocr/OCRBatchManager$BatchStatus");
        }

        public static BatchStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BatchStatus) ipChange.ipc$dispatch("714ff9cb", new Object[]{str});
            }
            return (BatchStatus) Enum.valueOf(BatchStatus.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(335544342);
        }

        public a() {
            super(Looper.getMainLooper());
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/a11y/ability/ocr/OCRBatchManager$BatchHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what == BatchStatus.BATCH_READY.ordinal()) {
                HashMap<String, View> hashMap = new HashMap<>();
                for (Map.Entry entry : OCRBatchManager.a(OCRBatchManager.this).entrySet()) {
                    String str = (String) entry.getKey();
                    WeakReference weakReference = (WeakReference) entry.getValue();
                    if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                        hashMap.put(str, view);
                    }
                }
                if (OCRBatchManager.b(OCRBatchManager.this) != null) {
                    OCRBatchManager.b(OCRBatchManager.this).a(hashMap);
                }
                OCRBatchManager.c(OCRBatchManager.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(HashMap<String, View> hashMap);
    }

    static {
        t2o.a(335544341);
    }

    public static /* synthetic */ Map a(OCRBatchManager oCRBatchManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("22e7a448", new Object[]{oCRBatchManager});
        }
        return oCRBatchManager.f6248a;
    }

    public static /* synthetic */ b b(OCRBatchManager oCRBatchManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1dd01909", new Object[]{oCRBatchManager});
        }
        return oCRBatchManager.d;
    }

    public static /* synthetic */ void c(OCRBatchManager oCRBatchManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9abf611", new Object[]{oCRBatchManager});
        } else {
            oCRBatchManager.f();
        }
    }

    public static OCRBatchManager e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OCRBatchManager) ipChange.ipc$dispatch("77bdc4ac", new Object[0]);
        }
        if (e == null) {
            synchronized (OCRBatchManager.class) {
                try {
                    if (e == null) {
                        e = new OCRBatchManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public void d(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac211e2b", new Object[]{this, str, view});
            return;
        }
        ((HashMap) this.f6248a).put(str, new WeakReference(view));
        if (this.c == BatchStatus.BATCH_FIRST_REQUEST) {
            long b2 = mh4.b();
            a aVar = this.b;
            int ordinal = BatchStatus.BATCH_READY.ordinal();
            if (b2 <= 0) {
                b2 = 1000;
            }
            aVar.sendEmptyMessageDelayed(ordinal, b2);
            this.c = BatchStatus.BATCH_WAITING;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("700cf104", new Object[]{this});
            return;
        }
        ((HashMap) this.f6248a).clear();
        this.c = BatchStatus.BATCH_FIRST_REQUEST;
    }

    public void g(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b208240b", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }
}
