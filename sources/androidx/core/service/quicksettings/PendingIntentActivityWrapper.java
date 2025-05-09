package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.PendingIntentCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PendingIntentActivityWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context mContext;
    private final int mFlags;
    private final Intent mIntent;
    private final boolean mIsMutable;
    private final Bundle mOptions;
    private final PendingIntent mPendingIntent;
    private final int mRequestCode;

    public PendingIntentActivityWrapper(Context context, int i, Intent intent, int i2, boolean z) {
        this(context, i, intent, i2, null, z);
    }

    private PendingIntent createPendingIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("89bc906a", new Object[]{this});
        }
        Bundle bundle = this.mOptions;
        if (bundle == null) {
            return PendingIntentCompat.getActivity(this.mContext, this.mRequestCode, this.mIntent, this.mFlags, this.mIsMutable);
        }
        return PendingIntentCompat.getActivity(this.mContext, this.mRequestCode, this.mIntent, this.mFlags, bundle, this.mIsMutable);
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    public int getFlags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a71a48cb", new Object[]{this})).intValue();
        }
        return this.mFlags;
    }

    public Intent getIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        return this.mIntent;
    }

    public Bundle getOptions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d234f1f3", new Object[]{this});
        }
        return this.mOptions;
    }

    public PendingIntent getPendingIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("5754edd0", new Object[]{this});
        }
        return this.mPendingIntent;
    }

    public int getRequestCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ae49d60", new Object[]{this})).intValue();
        }
        return this.mRequestCode;
    }

    public boolean isMutable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("404c9527", new Object[]{this})).booleanValue();
        }
        return this.mIsMutable;
    }

    public PendingIntentActivityWrapper(Context context, int i, Intent intent, int i2, Bundle bundle, boolean z) {
        this.mContext = context;
        this.mRequestCode = i;
        this.mIntent = intent;
        this.mFlags = i2;
        this.mOptions = bundle;
        this.mIsMutable = z;
        this.mPendingIntent = createPendingIntent();
    }
}
