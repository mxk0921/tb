package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.VersionedParcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gxn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class RemoteActionCompat implements VersionedParcelable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public PendingIntent mActionIntent;
    public CharSequence mContentDescription;
    public boolean mEnabled;
    public IconCompat mIcon;
    public boolean mShouldShowIcon;
    public CharSequence mTitle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static RemoteAction createRemoteAction(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteAction) ipChange.ipc$dispatch("c5a85faf", new Object[]{icon, charSequence, charSequence2, pendingIntent});
            }
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        public static PendingIntent getActionIntent(RemoteAction remoteAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PendingIntent) ipChange.ipc$dispatch("ab5df7c0", new Object[]{remoteAction});
            }
            return remoteAction.getActionIntent();
        }

        public static CharSequence getContentDescription(RemoteAction remoteAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("af27f9b5", new Object[]{remoteAction});
            }
            return remoteAction.getContentDescription();
        }

        public static Icon getIcon(RemoteAction remoteAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Icon) ipChange.ipc$dispatch("b584d144", new Object[]{remoteAction});
            }
            return remoteAction.getIcon();
        }

        public static CharSequence getTitle(RemoteAction remoteAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("ec21f46c", new Object[]{remoteAction});
            }
            return remoteAction.getTitle();
        }

        public static boolean isEnabled(RemoteAction remoteAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c5290ae7", new Object[]{remoteAction})).booleanValue();
            }
            return remoteAction.isEnabled();
        }

        public static void setEnabled(RemoteAction remoteAction, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78758989", new Object[]{remoteAction, new Boolean(z)});
            } else {
                remoteAction.setEnabled(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static void setShouldShowIcon(RemoteAction remoteAction, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e6dff9d", new Object[]{remoteAction, new Boolean(z)});
            } else {
                remoteAction.setShouldShowIcon(z);
            }
        }

        public static boolean shouldShowIcon(RemoteAction remoteAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("546c7099", new Object[]{remoteAction})).booleanValue();
            }
            return remoteAction.shouldShowIcon();
        }
    }

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        this.mIcon = (IconCompat) Preconditions.checkNotNull(iconCompat);
        this.mTitle = (CharSequence) Preconditions.checkNotNull(charSequence);
        this.mContentDescription = (CharSequence) Preconditions.checkNotNull(charSequence2);
        this.mActionIntent = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
        this.mEnabled = true;
        this.mShouldShowIcon = true;
    }

    public static RemoteActionCompat createFromRemoteAction(RemoteAction remoteAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteActionCompat) ipChange.ipc$dispatch("50fcb3c1", new Object[]{remoteAction});
        }
        Preconditions.checkNotNull(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.createFromIcon(Api26Impl.getIcon(remoteAction)), Api26Impl.getTitle(remoteAction), Api26Impl.getContentDescription(remoteAction), Api26Impl.getActionIntent(remoteAction));
        remoteActionCompat.setEnabled(Api26Impl.isEnabled(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.setShouldShowIcon(Api28Impl.shouldShowIcon(remoteAction));
        }
        return remoteActionCompat;
    }

    public PendingIntent getActionIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("681001b", new Object[]{this});
        }
        return this.mActionIntent;
    }

    public CharSequence getContentDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("3a52ebfa", new Object[]{this});
        }
        return this.mContentDescription;
    }

    public IconCompat getIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IconCompat) ipChange.ipc$dispatch("3d431b3d", new Object[]{this});
        }
        return this.mIcon;
    }

    public CharSequence getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this});
        }
        return this.mTitle;
    }

    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.mEnabled;
    }

    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnabled = z;
        }
    }

    public void setShouldShowIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd778922", new Object[]{this, new Boolean(z)});
        } else {
            this.mShouldShowIcon = z;
        }
    }

    public boolean shouldShowIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11c643f4", new Object[]{this})).booleanValue();
        }
        return this.mShouldShowIcon;
    }

    public RemoteAction toRemoteAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return gxn.a(ipChange.ipc$dispatch("a4d03bd", new Object[]{this}));
        }
        RemoteAction createRemoteAction = Api26Impl.createRemoteAction(this.mIcon.toIcon(), this.mTitle, this.mContentDescription, this.mActionIntent);
        Api26Impl.setEnabled(createRemoteAction, isEnabled());
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setShouldShowIcon(createRemoteAction, shouldShowIcon());
        }
        return createRemoteAction;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat) {
        Preconditions.checkNotNull(remoteActionCompat);
        this.mIcon = remoteActionCompat.mIcon;
        this.mTitle = remoteActionCompat.mTitle;
        this.mContentDescription = remoteActionCompat.mContentDescription;
        this.mActionIntent = remoteActionCompat.mActionIntent;
        this.mEnabled = remoteActionCompat.mEnabled;
        this.mShouldShowIcon = remoteActionCompat.mShouldShowIcon;
    }
}
