package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ActivityOptionsCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final ActivityOptions mActivityOptions;

        public ActivityOptionsCompatImpl(ActivityOptions activityOptions) {
            this.mActivityOptions = activityOptions;
        }

        public static /* synthetic */ Object ipc$super(ActivityOptionsCompatImpl activityOptionsCompatImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/app/ActivityOptionsCompat$ActivityOptionsCompatImpl");
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Rect getLaunchBounds() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("b8f3dbce", new Object[]{this});
            }
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return Api24Impl.getLaunchBounds(this.mActivityOptions);
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b598e2", new Object[]{this, pendingIntent});
            } else if (Build.VERSION.SDK_INT >= 23) {
                Api23Impl.requestUsageTimeReport(this.mActivityOptions, pendingIntent);
            }
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public ActivityOptionsCompat setLaunchBounds(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityOptionsCompat) ipChange.ipc$dispatch("dbf87fa0", new Object[]{this, rect});
            }
            return Build.VERSION.SDK_INT < 24 ? this : new ActivityOptionsCompatImpl(Api24Impl.setLaunchBounds(this.mActivityOptions, rect));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public ActivityOptionsCompat setShareIdentityEnabled(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityOptionsCompat) ipChange.ipc$dispatch("d6075f1f", new Object[]{this, new Boolean(z)});
            }
            return Build.VERSION.SDK_INT < 34 ? this : new ActivityOptionsCompatImpl(Api34Impl.setShareIdentityEnabled(this.mActivityOptions, z));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Bundle toBundle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("39245ca8", new Object[]{this});
            }
            return this.mActivityOptions.toBundle();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(ActivityOptionsCompat activityOptionsCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9226f178", new Object[]{this, activityOptionsCompat});
            } else if (activityOptionsCompat instanceof ActivityOptionsCompatImpl) {
                this.mActivityOptions.update(((ActivityOptionsCompatImpl) activityOptionsCompat).mActivityOptions);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static ActivityOptions makeSceneTransitionAnimation(Activity activity, View view, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ActivityOptions) ipChange.ipc$dispatch("53bcbce2", new Object[]{activity, view, str}) : ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        public static ActivityOptions makeTaskLaunchBehind() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityOptions) ipChange.ipc$dispatch("307d1d77", new Object[0]);
            }
            return ActivityOptions.makeTaskLaunchBehind();
        }

        @SafeVarargs
        public static ActivityOptions makeSceneTransitionAnimation(Activity activity, Pair<View, String>... pairArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ActivityOptions) ipChange.ipc$dispatch("900b2fff", new Object[]{activity, pairArr}) : ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static ActivityOptions makeBasic() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityOptions) ipChange.ipc$dispatch("9d3a9957", new Object[0]);
            }
            return ActivityOptions.makeBasic();
        }

        public static ActivityOptions makeClipRevealAnimation(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityOptions) ipChange.ipc$dispatch("31360802", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            return ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4);
        }

        public static void requestUsageTimeReport(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24371216", new Object[]{activityOptions, pendingIntent});
            } else {
                activityOptions.requestUsageTimeReport(pendingIntent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static Rect getLaunchBounds(ActivityOptions activityOptions) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("dd148a4", new Object[]{activityOptions});
            }
            return activityOptions.getLaunchBounds();
        }

        public static ActivityOptions setLaunchBounds(ActivityOptions activityOptions, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityOptions) ipChange.ipc$dispatch("56d3fd1a", new Object[]{activityOptions, rect});
            }
            return activityOptions.setLaunchBounds(rect);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api34Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api34Impl() {
        }

        public static ActivityOptions setShareIdentityEnabled(ActivityOptions activityOptions, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityOptions) ipChange.ipc$dispatch("40243111", new Object[]{activityOptions, new Boolean(z)});
            }
            return activityOptions.setShareIdentityEnabled(z);
        }
    }

    public static ActivityOptionsCompat makeBasic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityOptionsCompat) ipChange.ipc$dispatch("d1de95df", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return new ActivityOptionsCompatImpl(Api23Impl.makeBasic());
        }
        return new ActivityOptionsCompat();
    }

    public static ActivityOptionsCompat makeClipRevealAnimation(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityOptionsCompat) ipChange.ipc$dispatch("e3aa5c0a", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return new ActivityOptionsCompatImpl(Api23Impl.makeClipRevealAnimation(view, i, i2, i3, i4));
        }
        return new ActivityOptionsCompat();
    }

    public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityOptionsCompat) ipChange.ipc$dispatch("d1f33ed4", new Object[]{context, new Integer(i), new Integer(i2)});
        }
        return new ActivityOptionsCompatImpl(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityOptionsCompat) ipChange.ipc$dispatch("39d081f6", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        return new ActivityOptionsCompatImpl(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActivityOptionsCompat) ipChange.ipc$dispatch("4068c0ea", new Object[]{activity, view, str}) : new ActivityOptionsCompatImpl(Api21Impl.makeSceneTransitionAnimation(activity, view, str));
    }

    public static ActivityOptionsCompat makeTaskLaunchBehind() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityOptionsCompat) ipChange.ipc$dispatch("f1dbe9ff", new Object[0]);
        }
        return new ActivityOptionsCompatImpl(Api21Impl.makeTaskLaunchBehind());
    }

    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityOptionsCompat) ipChange.ipc$dispatch("e0fd89b8", new Object[]{view, bitmap, new Integer(i), new Integer(i2)});
        }
        return new ActivityOptionsCompatImpl(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    public Rect getLaunchBounds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("b8f3dbce", new Object[]{this});
        }
        return null;
    }

    public void requestUsageTimeReport(PendingIntent pendingIntent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b598e2", new Object[]{this, pendingIntent});
        }
    }

    public ActivityOptionsCompat setLaunchBounds(Rect rect) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActivityOptionsCompat) ipChange.ipc$dispatch("dbf87fa0", new Object[]{this, rect}) : this;
    }

    public ActivityOptionsCompat setShareIdentityEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActivityOptionsCompat) ipChange.ipc$dispatch("d6075f1f", new Object[]{this, new Boolean(z)}) : this;
    }

    public Bundle toBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("39245ca8", new Object[]{this});
        }
        return null;
    }

    public void update(ActivityOptionsCompat activityOptionsCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9226f178", new Object[]{this, activityOptionsCompat});
        }
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, androidx.core.util.Pair<View, String>... pairArr) {
        Pair[] pairArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityOptionsCompat) ipChange.ipc$dispatch("b3339c31", new Object[]{activity, pairArr});
        }
        if (pairArr != null) {
            pairArr2 = new Pair[pairArr.length];
            for (int i = 0; i < pairArr.length; i++) {
                androidx.core.util.Pair<View, String> pair = pairArr[i];
                pairArr2[i] = Pair.create(pair.first, pair.second);
            }
        } else {
            pairArr2 = null;
        }
        return new ActivityOptionsCompatImpl(Api21Impl.makeSceneTransitionAnimation(activity, pairArr2));
    }
}
