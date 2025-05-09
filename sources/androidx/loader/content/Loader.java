package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.core.util.DebugUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Loader<D> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context mContext;
    public int mId;
    public OnLoadCompleteListener<D> mListener;
    public OnLoadCanceledListener<D> mOnLoadCanceledListener;
    public boolean mStarted = false;
    public boolean mAbandoned = false;
    public boolean mReset = true;
    public boolean mContentChanged = false;
    public boolean mProcessingChange = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public final class ForceLoadContentObserver extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ForceLoadContentObserver() {
            super(new Handler());
        }

        public static /* synthetic */ Object ipc$super(ForceLoadContentObserver forceLoadContentObserver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/loader/content/Loader$ForceLoadContentObserver");
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2075b762", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
            } else {
                Loader.this.onContentChanged();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface OnLoadCanceledListener<D> {
        void onLoadCanceled(Loader<D> loader);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface OnLoadCompleteListener<D> {
        void onLoadComplete(Loader<D> loader, D d);
    }

    public Loader(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf1107c", new Object[]{this});
            return;
        }
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fad2df0b", new Object[]{this})).booleanValue();
        }
        return onCancelLoad();
    }

    public void commitContentChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cef3099", new Object[]{this});
        } else {
            this.mProcessingChange = false;
        }
    }

    public String dataToString(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3171e167", new Object[]{this, d});
        }
        StringBuilder sb = new StringBuilder(64);
        DebugUtils.buildShortClassTag(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public void deliverCancellation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38f374f", new Object[]{this});
            return;
        }
        OnLoadCanceledListener<D> onLoadCanceledListener = this.mOnLoadCanceledListener;
        if (onLoadCanceledListener != null) {
            onLoadCanceledListener.onLoadCanceled(this);
        }
    }

    public void deliverResult(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11fc8c5", new Object[]{this, d});
            return;
        }
        OnLoadCompleteListener<D> onLoadCompleteListener = this.mListener;
        if (onLoadCompleteListener != null) {
            onLoadCompleteListener.onLoadComplete(this, d);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab37b0f", new Object[]{this, str, fileDescriptor, printWriter, strArr});
            return;
        }
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    public void forceLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15433a78", new Object[]{this});
        } else {
            onForceLoad();
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return this.mId;
    }

    public boolean isAbandoned() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9757e355", new Object[]{this})).booleanValue();
        }
        return this.mAbandoned;
    }

    public boolean isReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("becba450", new Object[]{this})).booleanValue();
        }
        return this.mReset;
    }

    public boolean isStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a6f3902", new Object[]{this})).booleanValue();
        }
        return this.mStarted;
    }

    public void onAbandon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497f991d", new Object[]{this});
        }
    }

    public boolean onCancelLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29a086ca", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void onContentChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48f3b41", new Object[]{this});
        } else if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public void onForceLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48521ed9", new Object[]{this});
        }
    }

    public void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
        }
    }

    public void onStartLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5bce00", new Object[]{this});
        }
    }

    public void onStopLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f04a282", new Object[]{this});
        }
    }

    public void registerListener(int i, OnLoadCompleteListener<D> onLoadCompleteListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4936a25", new Object[]{this, new Integer(i), onLoadCompleteListener});
        } else if (this.mListener == null) {
            this.mListener = onLoadCompleteListener;
            this.mId = i;
        } else {
            throw new IllegalStateException("There is already a listener registered");
        }
    }

    public void registerOnLoadCanceledListener(OnLoadCanceledListener<D> onLoadCanceledListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("878147ae", new Object[]{this, onLoadCanceledListener});
        } else if (this.mOnLoadCanceledListener == null) {
            this.mOnLoadCanceledListener = onLoadCanceledListener;
        } else {
            throw new IllegalStateException("There is already a listener registered");
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66dd506", new Object[]{this});
        } else if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9591a01", new Object[]{this});
            return;
        }
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41d5261", new Object[]{this});
            return;
        }
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d59807ed", new Object[]{this})).booleanValue();
        }
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        DebugUtils.buildShortClassTag(this, sb);
        sb.append(" id=");
        sb.append(this.mId);
        sb.append("}");
        return sb.toString();
    }

    public void unregisterListener(OnLoadCompleteListener<D> onLoadCompleteListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49be6593", new Object[]{this, onLoadCompleteListener});
            return;
        }
        OnLoadCompleteListener<D> onLoadCompleteListener2 = this.mListener;
        if (onLoadCompleteListener2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (onLoadCompleteListener2 == onLoadCompleteListener) {
            this.mListener = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public void unregisterOnLoadCanceledListener(OnLoadCanceledListener<D> onLoadCanceledListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226fef35", new Object[]{this, onLoadCanceledListener});
            return;
        }
        OnLoadCanceledListener<D> onLoadCanceledListener2 = this.mOnLoadCanceledListener;
        if (onLoadCanceledListener2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (onLoadCanceledListener2 == onLoadCanceledListener) {
            this.mOnLoadCanceledListener = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }
}
