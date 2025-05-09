package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bqt implements zpt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Runnable val$runnable;

        public a(Runnable runnable) {
            this.val$runnable = runnable;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/adapter/impl/ThreadExecutorImpl$1");
        }

        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            this.val$runnable.run();
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int val$delaymillisecond;
        public final /* synthetic */ Runnable val$runnable;

        public b(int i, Runnable runnable) {
            this.val$delaymillisecond = i;
            this.val$runnable = runnable;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/adapter/impl/ThreadExecutorImpl$2");
        }

        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            try {
                Thread.sleep(this.val$delaymillisecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.val$runnable.run();
            return null;
        }
    }

    static {
        t2o.a(947912713);
        t2o.a(946864133);
    }

    @Override // tb.zpt
    public void delayExecute(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05115ec", new Object[]{this, runnable, new Integer(i)});
        } else {
            new b(i, runnable).execute(new Void[0]);
        }
    }

    @Override // tb.zpt
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            new a(runnable).execute(new Void[0]);
        }
    }
}
