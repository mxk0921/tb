package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RemoteViews mBigContentView;
    private final Notification.Builder mBuilder;
    private final NotificationCompat.Builder mBuilderCompat;
    private RemoteViews mContentView;
    private final Context mContext;
    private int mGroupAlertBehavior;
    private RemoteViews mHeadsUpContentView;
    private final List<Bundle> mActionExtrasList = new ArrayList();
    private final Bundle mExtras = new Bundle();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api20Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api20Impl() {
        }

        public static Notification.Builder addAction(Notification.Builder builder, Notification.Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("fe973872", new Object[]{builder, action});
            }
            return builder.addAction(action);
        }

        public static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Action.Builder) ipChange.ipc$dispatch("70c1b00f", new Object[]{builder, bundle});
            }
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, RemoteInput remoteInput) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Action.Builder) ipChange.ipc$dispatch("b03ee665", new Object[]{builder, remoteInput});
            }
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action build(Notification.Action.Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Action) ipChange.ipc$dispatch("32b466e4", new Object[]{builder});
            }
            return builder.build();
        }

        public static Notification.Action.Builder createBuilder(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Action.Builder) ipChange.ipc$dispatch("3d4ddf54", new Object[]{new Integer(i), charSequence, pendingIntent});
            }
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        public static String getGroup(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4040791a", new Object[]{notification});
            }
            return notification.getGroup();
        }

        public static Notification.Builder setGroup(Notification.Builder builder, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("1b935068", new Object[]{builder, str});
            }
            return builder.setGroup(str);
        }

        public static Notification.Builder setGroupSummary(Notification.Builder builder, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("a2cd5e30", new Object[]{builder, new Boolean(z)});
            }
            return builder.setGroupSummary(z);
        }

        public static Notification.Builder setLocalOnly(Notification.Builder builder, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("e32f0ffc", new Object[]{builder, new Boolean(z)});
            }
            return builder.setLocalOnly(z);
        }

        public static Notification.Builder setSortKey(Notification.Builder builder, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("801dacc6", new Object[]{builder, str});
            }
            return builder.setSortKey(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static Notification.Builder addPerson(Notification.Builder builder, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("7e9faa6f", new Object[]{builder, str});
            }
            return builder.addPerson(str);
        }

        public static Notification.Builder setCategory(Notification.Builder builder, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("e748585", new Object[]{builder, str});
            }
            return builder.setCategory(str);
        }

        public static Notification.Builder setColor(Notification.Builder builder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("ecad7e59", new Object[]{builder, new Integer(i)});
            }
            return builder.setColor(i);
        }

        public static Notification.Builder setPublicVersion(Notification.Builder builder, Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("e2ee338c", new Object[]{builder, notification});
            }
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder setSound(Notification.Builder builder, Uri uri, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("e91c94e5", new Object[]{builder, uri, obj});
            }
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder setVisibility(Notification.Builder builder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("a68a3c4c", new Object[]{builder, new Integer(i)});
            }
            return builder.setVisibility(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static Notification.Action.Builder createBuilder(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Action.Builder) ipChange.ipc$dispatch("1f53d962", new Object[]{icon, charSequence, pendingIntent});
            }
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder setLargeIcon(Notification.Builder builder, Icon icon) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("8581f274", new Object[]{builder, icon});
            }
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder setSmallIcon(Notification.Builder builder, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("b0347f15", new Object[]{builder, obj});
            }
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Action.Builder) ipChange.ipc$dispatch("f02161cb", new Object[]{builder, new Boolean(z)});
            }
            return builder.setAllowGeneratedReplies(z);
        }

        public static Notification.Builder setCustomBigContentView(Notification.Builder builder, RemoteViews remoteViews) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("1575c7ac", new Object[]{builder, remoteViews});
            }
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder setCustomContentView(Notification.Builder builder, RemoteViews remoteViews) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("7e1fae12", new Object[]{builder, remoteViews});
            }
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder setCustomHeadsUpContentView(Notification.Builder builder, RemoteViews remoteViews) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("7d4ec43a", new Object[]{builder, remoteViews});
            }
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder setRemoteInputHistory(Notification.Builder builder, CharSequence[] charSequenceArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("ddb6e794", new Object[]{builder, charSequenceArr});
            }
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static Notification.Builder createBuilder(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("8fd31309", new Object[]{context, str});
            }
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder setBadgeIconType(Notification.Builder builder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("8ff23e0c", new Object[]{builder, new Integer(i)});
            }
            return builder.setBadgeIconType(i);
        }

        public static Notification.Builder setColorized(Notification.Builder builder, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("b7b845b8", new Object[]{builder, new Boolean(z)});
            }
            return builder.setColorized(z);
        }

        public static Notification.Builder setGroupAlertBehavior(Notification.Builder builder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("c3ef05c9", new Object[]{builder, new Integer(i)});
            }
            return builder.setGroupAlertBehavior(i);
        }

        public static Notification.Builder setSettingsText(Notification.Builder builder, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("e8e8e39", new Object[]{builder, charSequence});
            }
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder setShortcutId(Notification.Builder builder, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("1f99d062", new Object[]{builder, str});
            }
            return builder.setShortcutId(str);
        }

        public static Notification.Builder setTimeoutAfter(Notification.Builder builder, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("d5b55514", new Object[]{builder, new Long(j)});
            }
            return builder.setTimeoutAfter(j);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static Notification.Builder addPerson(Notification.Builder builder, Person person) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("25afefed", new Object[]{builder, person});
            }
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder setSemanticAction(Notification.Action.Builder builder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Action.Builder) ipChange.ipc$dispatch("e4950a78", new Object[]{builder, new Integer(i)});
            }
            return builder.setSemanticAction(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static Notification.Builder setAllowSystemGeneratedContextualActions(Notification.Builder builder, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("dcd366da", new Object[]{builder, new Boolean(z)});
            }
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static Notification.Builder setBubbleMetadata(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("46f2b73d", new Object[]{builder, bubbleMetadata});
            }
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder setContextual(Notification.Action.Builder builder, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Action.Builder) ipChange.ipc$dispatch("3b85783e", new Object[]{builder, new Boolean(z)});
            }
            return builder.setContextual(z);
        }

        public static Notification.Builder setLocusId(Notification.Builder builder, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("a3c4c83c", new Object[]{builder, obj});
            }
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api31Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api31Impl() {
        }

        public static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Action.Builder) ipChange.ipc$dispatch("47bd43a4", new Object[]{builder, new Boolean(z)});
            }
            return builder.setAuthenticationRequired(z);
        }

        public static Notification.Builder setForegroundServiceBehavior(Notification.Builder builder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Builder) ipChange.ipc$dispatch("eaac035a", new Object[]{builder, new Integer(i)});
            }
            return builder.setForegroundServiceBehavior(i);
        }
    }

    private void addAction(NotificationCompat.Action action) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i;
        Icon icon;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611d3a2e", new Object[]{this, action});
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        IconCompat iconCompat = action.getIconCompat();
        if (i2 >= 23) {
            if (iconCompat != null) {
                icon = iconCompat.toIcon();
            } else {
                icon = null;
            }
            builder = Api23Impl.createBuilder(icon, action.getTitle(), action.getActionIntent());
        } else {
            if (iconCompat != null) {
                i = iconCompat.getResId();
            } else {
                i = 0;
            }
            builder = Api20Impl.createBuilder(i, action.getTitle(), action.getActionIntent());
        }
        if (action.getRemoteInputs() != null) {
            for (RemoteInput remoteInput : RemoteInput.fromCompat(action.getRemoteInputs())) {
                Api20Impl.addRemoteInput(builder, remoteInput);
            }
        }
        if (action.getExtras() != null) {
            bundle = new Bundle(action.getExtras());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(NotificationCompatJellybean.EXTRA_ALLOW_GENERATED_REPLIES, action.getAllowGeneratedReplies());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            Api24Impl.setAllowGeneratedReplies(builder, action.getAllowGeneratedReplies());
        }
        bundle.putInt(NotificationCompat.Action.EXTRA_SEMANTIC_ACTION, action.getSemanticAction());
        if (i3 >= 28) {
            Api28Impl.setSemanticAction(builder, action.getSemanticAction());
        }
        if (i3 >= 29) {
            Api29Impl.setContextual(builder, action.isContextual());
        }
        if (i3 >= 31) {
            Api31Impl.setAuthenticationRequired(builder, action.isAuthenticationRequired());
        }
        bundle.putBoolean(NotificationCompat.Action.EXTRA_SHOWS_USER_INTERFACE, action.getShowsUserInterface());
        Api20Impl.addExtras(builder, bundle);
        Api20Impl.addAction(this.mBuilder, Api20Impl.build(builder));
    }

    private static List<String> combineLists(List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("db48168", new Object[]{list, list2});
        }
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    private static List<String> getPeople(List<Person> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1922242a", new Object[]{list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Person person : list) {
            arrayList.add(person.resolveToLegacyUri());
        }
        return arrayList;
    }

    private void removeSoundAndVibration(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3203c3", new Object[]{this, notification});
            return;
        }
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public Notification build() {
        RemoteViews remoteViews;
        Bundle extras;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("4d025bf7", new Object[]{this});
        }
        NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        if (style != null) {
            remoteViews = style.makeContentView(this);
        } else {
            remoteViews = null;
        }
        Notification buildInternal = buildInternal();
        if (remoteViews != null) {
            buildInternal.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.mBuilderCompat.mContentView;
            if (remoteViews2 != null) {
                buildInternal.contentView = remoteViews2;
            }
        }
        if (!(style == null || (makeBigContentView = style.makeBigContentView(this)) == null)) {
            buildInternal.bigContentView = makeBigContentView;
        }
        if (!(style == null || (makeHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this)) == null)) {
            buildInternal.headsUpContentView = makeHeadsUpContentView;
        }
        if (!(style == null || (extras = NotificationCompat.getExtras(buildInternal)) == null)) {
            style.addCompatExtras(extras);
        }
        return buildInternal;
    }

    public Notification buildInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("2154283a", new Object[]{this});
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.mBuilder.build();
        }
        if (i >= 24) {
            Notification build = this.mBuilder.build();
            if (this.mGroupAlertBehavior != 0) {
                if (!(Api20Impl.getGroup(build) == null || (build.flags & 512) == 0 || this.mGroupAlertBehavior != 2)) {
                    removeSoundAndVibration(build);
                }
                if (Api20Impl.getGroup(build) != null && (build.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(build);
                }
            }
            return build;
        }
        this.mBuilder.setExtras(this.mExtras);
        Notification build2 = this.mBuilder.build();
        RemoteViews remoteViews = this.mContentView;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.mBigContentView;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.mHeadsUpContentView;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.mGroupAlertBehavior != 0) {
            if (!(Api20Impl.getGroup(build2) == null || (build2.flags & 512) == 0 || this.mGroupAlertBehavior != 2)) {
                removeSoundAndVibration(build2);
            }
            if (Api20Impl.getGroup(build2) != null && (build2.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                removeSoundAndVibration(build2);
            }
        }
        return build2;
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public Notification.Builder getBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification.Builder) ipChange.ipc$dispatch("d3fb1d69", new Object[]{this});
        }
        return this.mBuilder;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        List<String> list;
        int i;
        Object obj;
        this.mBuilderCompat = builder;
        Context context = builder.mContext;
        this.mContext = context;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.mBuilder = Api26Impl.createBuilder(context, builder.mChannelId);
        } else {
            this.mBuilder = new Notification.Builder(builder.mContext);
        }
        Notification notification = builder.mNotification;
        this.mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder.mFullScreenIntent, (notification.flags & 128) != 0).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        if (i2 < 23) {
            Notification.Builder builder2 = this.mBuilder;
            IconCompat iconCompat = builder.mLargeIcon;
            builder2.setLargeIcon(iconCompat == null ? null : iconCompat.getBitmap());
        } else {
            Notification.Builder builder3 = this.mBuilder;
            IconCompat iconCompat2 = builder.mLargeIcon;
            Api23Impl.setLargeIcon(builder3, iconCompat2 == null ? null : iconCompat2.toIcon(context));
        }
        this.mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
        NotificationCompat.Style style = builder.mStyle;
        if (style instanceof NotificationCompat.CallStyle) {
            for (NotificationCompat.Action action : ((NotificationCompat.CallStyle) style).getActionsListWithSystemActions()) {
                addAction(action);
            }
        } else {
            Iterator<NotificationCompat.Action> it = builder.mActions.iterator();
            while (it.hasNext()) {
                addAction(it.next());
            }
        }
        Bundle bundle = builder.mExtras;
        if (bundle != null) {
            this.mExtras.putAll(bundle);
        }
        int i3 = Build.VERSION.SDK_INT;
        this.mContentView = builder.mContentView;
        this.mBigContentView = builder.mBigContentView;
        this.mBuilder.setShowWhen(builder.mShowWhen);
        Api20Impl.setLocalOnly(this.mBuilder, builder.mLocalOnly);
        Api20Impl.setGroup(this.mBuilder, builder.mGroupKey);
        Api20Impl.setSortKey(this.mBuilder, builder.mSortKey);
        Api20Impl.setGroupSummary(this.mBuilder, builder.mGroupSummary);
        this.mGroupAlertBehavior = builder.mGroupAlertBehavior;
        Api21Impl.setCategory(this.mBuilder, builder.mCategory);
        Api21Impl.setColor(this.mBuilder, builder.mColor);
        Api21Impl.setVisibility(this.mBuilder, builder.mVisibility);
        Api21Impl.setPublicVersion(this.mBuilder, builder.mPublicVersion);
        Api21Impl.setSound(this.mBuilder, notification.sound, notification.audioAttributes);
        if (i3 < 28) {
            list = combineLists(getPeople(builder.mPersonList), builder.mPeople);
        } else {
            list = builder.mPeople;
        }
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                Api21Impl.addPerson(this.mBuilder, str);
            }
        }
        this.mHeadsUpContentView = builder.mHeadsUpContentView;
        if (builder.mInvisibleActions.size() > 0) {
            Bundle bundle2 = builder.getExtras().getBundle(NotificationCompat.CarExtender.EXTRA_CAR_EXTENDER);
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i4 = 0; i4 < builder.mInvisibleActions.size(); i4++) {
                bundle4.putBundle(Integer.toString(i4), NotificationCompatJellybean.getBundleForAction(builder.mInvisibleActions.get(i4)));
            }
            bundle2.putBundle(NotificationCompat.CarExtender.EXTRA_INVISIBLE_ACTIONS, bundle4);
            bundle3.putBundle(NotificationCompat.CarExtender.EXTRA_INVISIBLE_ACTIONS, bundle4);
            builder.getExtras().putBundle(NotificationCompat.CarExtender.EXTRA_CAR_EXTENDER, bundle2);
            this.mExtras.putBundle(NotificationCompat.CarExtender.EXTRA_CAR_EXTENDER, bundle3);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (obj = builder.mSmallIcon) != null) {
            Api23Impl.setSmallIcon(this.mBuilder, obj);
        }
        if (i5 >= 24) {
            this.mBuilder.setExtras(builder.mExtras);
            Api24Impl.setRemoteInputHistory(this.mBuilder, builder.mRemoteInputHistory);
            RemoteViews remoteViews = builder.mContentView;
            if (remoteViews != null) {
                Api24Impl.setCustomContentView(this.mBuilder, remoteViews);
            }
            RemoteViews remoteViews2 = builder.mBigContentView;
            if (remoteViews2 != null) {
                Api24Impl.setCustomBigContentView(this.mBuilder, remoteViews2);
            }
            RemoteViews remoteViews3 = builder.mHeadsUpContentView;
            if (remoteViews3 != null) {
                Api24Impl.setCustomHeadsUpContentView(this.mBuilder, remoteViews3);
            }
        }
        if (i5 >= 26) {
            Api26Impl.setBadgeIconType(this.mBuilder, builder.mBadgeIcon);
            Api26Impl.setSettingsText(this.mBuilder, builder.mSettingsText);
            Api26Impl.setShortcutId(this.mBuilder, builder.mShortcutId);
            Api26Impl.setTimeoutAfter(this.mBuilder, builder.mTimeout);
            Api26Impl.setGroupAlertBehavior(this.mBuilder, builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                Api26Impl.setColorized(this.mBuilder, builder.mColorized);
            }
            if (!TextUtils.isEmpty(builder.mChannelId)) {
                this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 28) {
            Iterator<Person> it2 = builder.mPersonList.iterator();
            while (it2.hasNext()) {
                Api28Impl.addPerson(this.mBuilder, it2.next().toAndroidPerson());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            Api29Impl.setAllowSystemGeneratedContextualActions(this.mBuilder, builder.mAllowSystemGeneratedContextualActions);
            Api29Impl.setBubbleMetadata(this.mBuilder, NotificationCompat.BubbleMetadata.toPlatform(builder.mBubbleMetadata));
            LocusIdCompat locusIdCompat = builder.mLocusId;
            if (locusIdCompat != null) {
                Api29Impl.setLocusId(this.mBuilder, locusIdCompat.toLocusId());
            }
        }
        if (i6 >= 31 && (i = builder.mFgsDeferBehavior) != 0) {
            Api31Impl.setForegroundServiceBehavior(this.mBuilder, i);
        }
        if (builder.mSilent) {
            if (this.mBuilderCompat.mGroupSummary) {
                this.mGroupAlertBehavior = 2;
            } else {
                this.mGroupAlertBehavior = 1;
            }
            this.mBuilder.setVibrate(null);
            this.mBuilder.setSound(null);
            int i7 = notification.defaults & (-4);
            notification.defaults = i7;
            this.mBuilder.setDefaults(i7);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.mBuilderCompat.mGroupKey)) {
                    Api20Impl.setGroup(this.mBuilder, NotificationCompat.GROUP_KEY_SILENT);
                }
                Api26Impl.setGroupAlertBehavior(this.mBuilder, this.mGroupAlertBehavior);
            }
        }
    }
}
