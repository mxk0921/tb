package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.Person;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.BidiFormatter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import tb.a9k;
import tb.c9k;
import tb.d9k;
import tb.e9k;
import tb.f9k;
import tb.x8k;
import tb.y8k;
import tb.z8k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NotificationCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    public static final String EXTRA_CALL_PERSON = "android.callPerson";
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    public static final String EXTRA_CALL_TYPE = "android.callType";
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final String EXTRA_COLORIZED = "android.colorized";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;
    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Action {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
        public static final String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public PendingIntent actionIntent;
        @Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private boolean mAuthenticationRequired;
        private final RemoteInput[] mDataOnlyRemoteInputs;
        public final Bundle mExtras;
        private IconCompat mIcon;
        private final boolean mIsContextual;
        private final RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        public boolean mShowsUserInterface;
        public CharSequence title;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static final class Builder {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean mAllowGeneratedReplies;
            private boolean mAuthenticationRequired;
            private final Bundle mExtras;
            private final IconCompat mIcon;
            private final PendingIntent mIntent;
            private boolean mIsContextual;
            private ArrayList<RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final CharSequence mTitle;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
            public static class Api20Impl {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private Api20Impl() {
                }

                public static Bundle getExtras(Notification.Action action) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Bundle) ipChange.ipc$dispatch("745c7404", new Object[]{action});
                    }
                    return action.getExtras();
                }

                public static RemoteInput[] getRemoteInputs(Notification.Action action) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (RemoteInput[]) ipChange.ipc$dispatch("5b17bd18", new Object[]{action});
                    }
                    return action.getRemoteInputs();
                }
            }

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
            public static class Api23Impl {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private Api23Impl() {
                }

                public static Icon getIcon(Notification.Action action) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Icon) ipChange.ipc$dispatch("9d917915", new Object[]{action});
                    }
                    return action.getIcon();
                }
            }

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
            public static class Api24Impl {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private Api24Impl() {
                }

                public static boolean getAllowGeneratedReplies(Notification.Action action) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("7ee78851", new Object[]{action})).booleanValue();
                    }
                    return action.getAllowGeneratedReplies();
                }
            }

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
            public static class Api28Impl {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private Api28Impl() {
                }

                public static int getSemanticAction(Notification.Action action) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Number) ipChange.ipc$dispatch("c320ff9a", new Object[]{action})).intValue();
                    }
                    return action.getSemanticAction();
                }
            }

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
            public static class Api29Impl {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private Api29Impl() {
                }

                public static boolean isContextual(Notification.Action action) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("6104f1c2", new Object[]{action})).booleanValue();
                    }
                    return action.isContextual();
                }
            }

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
            public static class Api31Impl {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private Api31Impl() {
                }

                public static boolean isAuthenticationRequired(Notification.Action action) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("4a68699c", new Object[]{action})).booleanValue();
                    }
                    return action.isAuthenticationRequired();
                }
            }

            public Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void checkContextualActionNullFields() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ae7a2796", new Object[]{this});
                } else if (this.mIsContextual && this.mIntent == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public Builder addExtras(Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("ebdb36ee", new Object[]{this, bundle});
                }
                if (bundle != null) {
                    this.mExtras.putAll(bundle);
                }
                return this;
            }

            public Builder addRemoteInput(RemoteInput remoteInput) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("8cb63650", new Object[]{this, remoteInput});
                }
                if (this.mRemoteInputs == null) {
                    this.mRemoteInputs = new ArrayList<>();
                }
                if (remoteInput != null) {
                    this.mRemoteInputs.add(remoteInput);
                }
                return this;
            }

            public Action build() {
                RemoteInput[] remoteInputArr;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Action) ipChange.ipc$dispatch("5c89c8d1", new Object[]{this});
                }
                checkContextualActionNullFields();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<RemoteInput> arrayList3 = this.mRemoteInputs;
                if (arrayList3 != null) {
                    Iterator<RemoteInput> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        RemoteInput next = it.next();
                        if (next.isDataOnly()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                RemoteInput[] remoteInputArr2 = null;
                if (arrayList.isEmpty()) {
                    remoteInputArr = null;
                } else {
                    remoteInputArr = (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    remoteInputArr2 = (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]);
                }
                return new Action(this.mIcon, this.mTitle, this.mIntent, this.mExtras, remoteInputArr2, remoteInputArr, this.mAllowGeneratedReplies, this.mSemanticAction, this.mShowsUserInterface, this.mIsContextual, this.mAuthenticationRequired);
            }

            public Builder extend(Extender extender) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("54a6023f", new Object[]{this, extender});
                }
                extender.extend(this);
                return this;
            }

            public Bundle getExtras() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
                }
                return this.mExtras;
            }

            public Builder setAllowGeneratedReplies(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("ee35bf72", new Object[]{this, new Boolean(z)});
                }
                this.mAllowGeneratedReplies = z;
                return this;
            }

            public Builder setAuthenticationRequired(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("ea5cbef9", new Object[]{this, new Boolean(z)});
                }
                this.mAuthenticationRequired = z;
                return this;
            }

            public Builder setContextual(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("ca4c241f", new Object[]{this, new Boolean(z)});
                }
                this.mIsContextual = z;
                return this;
            }

            public Builder setSemanticAction(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("5cd601e3", new Object[]{this, new Integer(i)});
                }
                this.mSemanticAction = i;
                return this;
            }

            public Builder setShowsUserInterface(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("caad0b18", new Object[]{this, new Boolean(z)});
                }
                this.mShowsUserInterface = z;
                return this;
            }

            public Builder(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public Builder(Action action) {
                this(action.getIconCompat(), action.title, action.actionIntent, new Bundle(action.mExtras), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.mShowsUserInterface, action.isContextual(), action.isAuthenticationRequired());
            }

            public static Builder fromAndroidAction(Notification.Action action) {
                Builder builder;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("da566843", new Object[]{action});
                }
                if (Build.VERSION.SDK_INT < 23 || Api23Impl.getIcon(action) == null) {
                    builder = new Builder(action.icon, action.title, action.actionIntent);
                } else {
                    builder = new Builder(IconCompat.createFromIconOrNullIfZeroResId(Api23Impl.getIcon(action)), action.title, action.actionIntent);
                }
                RemoteInput[] remoteInputs = Api20Impl.getRemoteInputs(action);
                if (!(remoteInputs == null || remoteInputs.length == 0)) {
                    for (RemoteInput remoteInput : remoteInputs) {
                        builder.addRemoteInput(RemoteInput.fromPlatform(remoteInput));
                    }
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    builder.mAllowGeneratedReplies = Api24Impl.getAllowGeneratedReplies(action);
                }
                if (i >= 28) {
                    builder.setSemanticAction(Api28Impl.getSemanticAction(action));
                }
                if (i >= 29) {
                    builder.setContextual(Api29Impl.isContextual(action));
                }
                if (i >= 31) {
                    builder.setAuthenticationRequired(Api31Impl.isAuthenticationRequired(action));
                }
                builder.addExtras(Api20Impl.getExtras(action));
                return builder;
            }

            private Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.mAllowGeneratedReplies = true;
                this.mShowsUserInterface = true;
                this.mIcon = iconCompat;
                this.mTitle = Builder.limitCharSequenceLength(charSequence);
                this.mIntent = pendingIntent;
                this.mExtras = bundle;
                this.mRemoteInputs = remoteInputArr == null ? null : new ArrayList<>(Arrays.asList(remoteInputArr));
                this.mAllowGeneratedReplies = z;
                this.mSemanticAction = i;
                this.mShowsUserInterface = z2;
                this.mIsContextual = z3;
                this.mAuthenticationRequired = z4;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public interface Extender {
            Builder extend(Builder builder);
        }

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public @interface SemanticAction {
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static final class WearableExtender implements Extender {
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            private static final int DEFAULT_FLAGS = 1;
            private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final String KEY_CANCEL_LABEL = "cancelLabel";
            private static final String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final String KEY_FLAGS = "flags";
            private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private CharSequence mCancelLabel;
            private CharSequence mConfirmLabel;
            private int mFlags;
            private CharSequence mInProgressLabel;

            public WearableExtender() {
                this.mFlags = 1;
            }

            private void setFlag(int i, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f44fe366", new Object[]{this, new Integer(i), new Boolean(z)});
                } else if (z) {
                    this.mFlags = i | this.mFlags;
                } else {
                    this.mFlags = (~i) & this.mFlags;
                }
            }

            @Deprecated
            public CharSequence getCancelLabel() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (CharSequence) ipChange.ipc$dispatch("f945d96f", new Object[]{this});
                }
                return this.mCancelLabel;
            }

            @Deprecated
            public CharSequence getConfirmLabel() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (CharSequence) ipChange.ipc$dispatch("9497c289", new Object[]{this});
                }
                return this.mConfirmLabel;
            }

            public boolean getHintLaunchesActivity() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("1bc76cf8", new Object[]{this})).booleanValue();
                }
                if ((this.mFlags & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Deprecated
            public CharSequence getInProgressLabel() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (CharSequence) ipChange.ipc$dispatch("cd199e67", new Object[]{this});
                }
                return this.mInProgressLabel;
            }

            public WearableExtender setAvailableOffline(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WearableExtender) ipChange.ipc$dispatch("c0497105", new Object[]{this, new Boolean(z)});
                }
                setFlag(1, z);
                return this;
            }

            @Deprecated
            public WearableExtender setCancelLabel(CharSequence charSequence) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WearableExtender) ipChange.ipc$dispatch("2a752c93", new Object[]{this, charSequence});
                }
                this.mCancelLabel = charSequence;
                return this;
            }

            @Deprecated
            public WearableExtender setConfirmLabel(CharSequence charSequence) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WearableExtender) ipChange.ipc$dispatch("82053795", new Object[]{this, charSequence});
                }
                this.mConfirmLabel = charSequence;
                return this;
            }

            public WearableExtender setHintDisplayActionInline(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WearableExtender) ipChange.ipc$dispatch("1a680c31", new Object[]{this, new Boolean(z)});
                }
                setFlag(4, z);
                return this;
            }

            public WearableExtender setHintLaunchesActivity(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WearableExtender) ipChange.ipc$dispatch("543b1862", new Object[]{this, new Boolean(z)});
                }
                setFlag(2, z);
                return this;
            }

            @Deprecated
            public WearableExtender setInProgressLabel(CharSequence charSequence) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WearableExtender) ipChange.ipc$dispatch("6c87a98b", new Object[]{this, charSequence});
                }
                this.mInProgressLabel = charSequence;
                return this;
            }

            public WearableExtender clone() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WearableExtender) ipChange.ipc$dispatch("59b873d2", new Object[]{this});
                }
                WearableExtender wearableExtender = new WearableExtender();
                wearableExtender.mFlags = this.mFlags;
                wearableExtender.mInProgressLabel = this.mInProgressLabel;
                wearableExtender.mConfirmLabel = this.mConfirmLabel;
                wearableExtender.mCancelLabel = this.mCancelLabel;
                return wearableExtender;
            }

            @Override // androidx.core.app.NotificationCompat.Action.Extender
            public Builder extend(Builder builder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("d8fe03d9", new Object[]{this, builder});
                }
                Bundle bundle = new Bundle();
                int i = this.mFlags;
                if (i != 1) {
                    bundle.putInt("flags", i);
                }
                CharSequence charSequence = this.mInProgressLabel;
                if (charSequence != null) {
                    bundle.putCharSequence(KEY_IN_PROGRESS_LABEL, charSequence);
                }
                CharSequence charSequence2 = this.mConfirmLabel;
                if (charSequence2 != null) {
                    bundle.putCharSequence(KEY_CONFIRM_LABEL, charSequence2);
                }
                CharSequence charSequence3 = this.mCancelLabel;
                if (charSequence3 != null) {
                    bundle.putCharSequence(KEY_CANCEL_LABEL, charSequence3);
                }
                builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, bundle);
                return builder;
            }

            public WearableExtender(Action action) {
                this.mFlags = 1;
                Bundle bundle = action.getExtras().getBundle(EXTRA_WEARABLE_EXTENSIONS);
                if (bundle != null) {
                    this.mFlags = bundle.getInt("flags", 1);
                    this.mInProgressLabel = bundle.getCharSequence(KEY_IN_PROGRESS_LABEL);
                    this.mConfirmLabel = bundle.getCharSequence(KEY_CONFIRM_LABEL);
                    this.mCancelLabel = bundle.getCharSequence(KEY_CANCEL_LABEL);
                }
            }

            public boolean getHintDisplayActionInline() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f7a35e9f", new Object[]{this})).booleanValue();
                }
                return (this.mFlags & 4) != 0;
            }

            public boolean isAvailableOffline() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f9f5a6af", new Object[]{this})).booleanValue();
                }
                return (this.mFlags & 1) != 0;
            }
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent);
        }

        public PendingIntent getActionIntent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PendingIntent) ipChange.ipc$dispatch("681001b", new Object[]{this});
            }
            return this.actionIntent;
        }

        public boolean getAllowGeneratedReplies() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7b5656b7", new Object[]{this})).booleanValue();
            }
            return this.mAllowGeneratedReplies;
        }

        public RemoteInput[] getDataOnlyRemoteInputs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteInput[]) ipChange.ipc$dispatch("17474d34", new Object[]{this});
            }
            return this.mDataOnlyRemoteInputs;
        }

        public Bundle getExtras() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
            }
            return this.mExtras;
        }

        @Deprecated
        public int getIcon() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fcc19e9", new Object[]{this})).intValue();
            }
            return this.icon;
        }

        public IconCompat getIconCompat() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IconCompat) ipChange.ipc$dispatch("6cdca29b", new Object[]{this});
            }
            if (this.mIcon == null && (i = this.icon) != 0) {
                this.mIcon = IconCompat.createWithResource(null, "", i);
            }
            return this.mIcon;
        }

        public RemoteInput[] getRemoteInputs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteInput[]) ipChange.ipc$dispatch("3617408a", new Object[]{this});
            }
            return this.mRemoteInputs;
        }

        public int getSemanticAction() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d42a40c", new Object[]{this})).intValue();
            }
            return this.mSemanticAction;
        }

        public boolean getShowsUserInterface() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c07df3b9", new Object[]{this})).booleanValue();
            }
            return this.mShowsUserInterface;
        }

        public CharSequence getTitle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this});
            }
            return this.title;
        }

        public boolean isAuthenticationRequired() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("42f1340c", new Object[]{this})).booleanValue();
            }
            return this.mAuthenticationRequired;
        }

        public boolean isContextual() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fc12f726", new Object[]{this})).booleanValue();
            }
            return this.mIsContextual;
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, false);
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z, i2, z2, z3, z4);
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.mShowsUserInterface = true;
            this.mIcon = iconCompat;
            if (iconCompat != null && iconCompat.getType() == 2) {
                this.icon = iconCompat.getResId();
            }
            this.title = Builder.limitCharSequenceLength(charSequence);
            this.actionIntent = pendingIntent;
            this.mExtras = bundle == null ? new Bundle() : bundle;
            this.mRemoteInputs = remoteInputArr;
            this.mDataOnlyRemoteInputs = remoteInputArr2;
            this.mAllowGeneratedReplies = z;
            this.mSemanticAction = i;
            this.mShowsUserInterface = z2;
            this.mIsContextual = z3;
            this.mAuthenticationRequired = z4;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api20Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api20Impl() {
        }

        public static boolean getAllowFreeFormInput(RemoteInput remoteInput) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ea8e1dc1", new Object[]{remoteInput})).booleanValue();
            }
            return remoteInput.getAllowFreeFormInput();
        }

        public static CharSequence[] getChoices(RemoteInput remoteInput) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence[]) ipChange.ipc$dispatch("6cb1e851", new Object[]{remoteInput});
            }
            return remoteInput.getChoices();
        }

        public static Bundle getExtras(Notification.Action action) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("745c7404", new Object[]{action}) : action.getExtras();
        }

        public static String getGroup(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4040791a", new Object[]{notification});
            }
            return notification.getGroup();
        }

        public static CharSequence getLabel(RemoteInput remoteInput) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("f6e3e794", new Object[]{remoteInput});
            }
            return remoteInput.getLabel();
        }

        public static RemoteInput[] getRemoteInputs(Notification.Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteInput[]) ipChange.ipc$dispatch("5b17bd18", new Object[]{action});
            }
            return action.getRemoteInputs();
        }

        public static String getResultKey(RemoteInput remoteInput) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("21165088", new Object[]{remoteInput});
            }
            return remoteInput.getResultKey();
        }

        public static String getSortKey(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a8959df8", new Object[]{notification});
            }
            return notification.getSortKey();
        }

        public static Bundle getExtras(RemoteInput remoteInput) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("8156432f", new Object[]{remoteInput}) : remoteInput.getExtras();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static Icon getIcon(Notification.Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Icon) ipChange.ipc$dispatch("9d917915", new Object[]{action});
            }
            return action.getIcon();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static boolean getAllowGeneratedReplies(Notification.Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7ee78851", new Object[]{action})).booleanValue();
            }
            return action.getAllowGeneratedReplies();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static int getBadgeIconType(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c7d15590", new Object[]{notification})).intValue();
            }
            return notification.getBadgeIconType();
        }

        public static String getChannelId(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("748df13b", new Object[]{notification});
            }
            return notification.getChannelId();
        }

        public static int getGroupAlertBehavior(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3680a7f5", new Object[]{notification})).intValue();
            }
            return notification.getGroupAlertBehavior();
        }

        public static CharSequence getSettingsText(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("ad68f37", new Object[]{notification});
            }
            return notification.getSettingsText();
        }

        public static String getShortcutId(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4f84a82c", new Object[]{notification});
            }
            return notification.getShortcutId();
        }

        public static long getTimeoutAfter(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("348e2ce2", new Object[]{notification})).longValue();
            }
            return notification.getTimeoutAfter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static int getSemanticAction(Notification.Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c320ff9a", new Object[]{action})).intValue();
            }
            return action.getSemanticAction();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2cedae0", new Object[]{notification})).booleanValue();
            }
            return notification.getAllowSystemGeneratedContextualActions();
        }

        public static Notification.BubbleMetadata getBubbleMetadata(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.BubbleMetadata) ipChange.ipc$dispatch("5fa36d19", new Object[]{notification});
            }
            return notification.getBubbleMetadata();
        }

        public static int getEditChoicesBeforeSending(RemoteInput remoteInput) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("567a3ace", new Object[]{remoteInput})).intValue();
            }
            return remoteInput.getEditChoicesBeforeSending();
        }

        public static LocusId getLocusId(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocusId) ipChange.ipc$dispatch("56e517ae", new Object[]{notification});
            }
            return notification.getLocusId();
        }

        public static boolean isContextual(Notification.Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6104f1c2", new Object[]{action})).booleanValue();
            }
            return action.isContextual();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api31Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api31Impl() {
        }

        public static boolean isAuthenticationRequired(Notification.Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4a68699c", new Object[]{action})).booleanValue();
            }
            return action.isAuthenticationRequired();
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface BadgeIconType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class BigPictureStyle extends Style {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private IconCompat mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private CharSequence mPictureContentDescription;
        private IconCompat mPictureIcon;
        private boolean mShowBigPictureWhenCollapsed;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api23Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api23Impl() {
            }

            public static void setBigLargeIcon(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("86986bcd", new Object[]{bigPictureStyle, icon});
                } else {
                    bigPictureStyle.bigLargeIcon(icon);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api31Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api31Impl() {
            }

            public static void setBigPicture(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("50ca0177", new Object[]{bigPictureStyle, icon});
                } else {
                    bigPictureStyle.bigPicture(icon);
                }
            }

            public static void setContentDescription(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("599f91d7", new Object[]{bigPictureStyle, charSequence});
                } else {
                    bigPictureStyle.setContentDescription(charSequence);
                }
            }

            public static void showBigPictureWhenCollapsed(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b72a09e4", new Object[]{bigPictureStyle, new Boolean(z)});
                } else {
                    bigPictureStyle.showBigPictureWhenCollapsed(z);
                }
            }
        }

        public BigPictureStyle() {
        }

        private static IconCompat asIconCompat(Parcelable parcelable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IconCompat) ipChange.ipc$dispatch("5f25d774", new Object[]{parcelable});
            }
            if (parcelable == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23 && y8k.a(parcelable)) {
                return IconCompat.createFromIcon(z8k.a(parcelable));
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.createWithBitmap((Bitmap) parcelable);
            }
            return null;
        }

        public static IconCompat getPictureIcon(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IconCompat) ipChange.ipc$dispatch("97c37d07", new Object[]{bundle});
            }
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(NotificationCompat.EXTRA_PICTURE);
            if (parcelable != null) {
                return asIconCompat(parcelable);
            }
            return asIconCompat(bundle.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        }

        public static /* synthetic */ Object ipc$super(BigPictureStyle bigPictureStyle, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -354564456) {
                super.clearCompatExtraKeys((Bundle) objArr[0]);
                return null;
            } else if (hashCode == 1225057360) {
                super.restoreFromCompatExtras((Bundle) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/core/app/NotificationCompat$BigPictureStyle");
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Context context;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bce7500", new Object[]{this, notificationBuilderWithBuilderAccessor});
                return;
            }
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle);
            IconCompat iconCompat = this.mPictureIcon;
            Context context2 = null;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    if (notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder) {
                        context = ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getContext();
                    } else {
                        context = null;
                    }
                    Api31Impl.setBigPicture(bigContentTitle, this.mPictureIcon.toIcon(context));
                } else if (iconCompat.getType() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.mPictureIcon.getBitmap());
                }
            }
            if (this.mBigLargeIconSet) {
                IconCompat iconCompat2 = this.mBigLargeIcon;
                if (iconCompat2 == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else if (Build.VERSION.SDK_INT >= 23) {
                    if (notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder) {
                        context2 = ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getContext();
                    }
                    Api23Impl.setBigLargeIcon(bigContentTitle, this.mBigLargeIcon.toIcon(context2));
                } else if (iconCompat2.getType() == 1) {
                    bigContentTitle.bigLargeIcon(this.mBigLargeIcon.getBitmap());
                } else {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                }
            }
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.showBigPictureWhenCollapsed(bigContentTitle, this.mShowBigPictureWhenCollapsed);
                Api31Impl.setContentDescription(bigContentTitle, this.mPictureContentDescription);
            }
        }

        public BigPictureStyle bigLargeIcon(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BigPictureStyle) ipChange.ipc$dispatch("2f82ef7e", new Object[]{this, bitmap});
            }
            this.mBigLargeIcon = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            this.mBigLargeIconSet = true;
            return this;
        }

        public BigPictureStyle bigPicture(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BigPictureStyle) ipChange.ipc$dispatch("c55547a8", new Object[]{this, bitmap});
            }
            this.mPictureIcon = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void clearCompatExtraKeys(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eaddc698", new Object[]{this, bundle});
                return;
            }
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_LARGE_ICON_BIG);
            bundle.remove(NotificationCompat.EXTRA_PICTURE);
            bundle.remove(NotificationCompat.EXTRA_PICTURE_ICON);
            bundle.remove(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public String getClassName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
            }
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void restoreFromCompatExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4904e450", new Object[]{this, bundle});
                return;
            }
            super.restoreFromCompatExtras(bundle);
            if (bundle.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
                this.mBigLargeIcon = asIconCompat(bundle.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
                this.mBigLargeIconSet = true;
            }
            this.mPictureIcon = getPictureIcon(bundle);
            this.mShowBigPictureWhenCollapsed = bundle.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        public BigPictureStyle setBigContentTitle(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BigPictureStyle) ipChange.ipc$dispatch("d2edbd09", new Object[]{this, charSequence});
            }
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public BigPictureStyle setContentDescription(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BigPictureStyle) ipChange.ipc$dispatch("4d8e2601", new Object[]{this, charSequence});
            }
            this.mPictureContentDescription = charSequence;
            return this;
        }

        public BigPictureStyle setSummaryText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BigPictureStyle) ipChange.ipc$dispatch("9841d915", new Object[]{this, charSequence});
            }
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public BigPictureStyle showBigPictureWhenCollapsed(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BigPictureStyle) ipChange.ipc$dispatch("964d5626", new Object[]{this, new Boolean(z)});
            }
            this.mShowBigPictureWhenCollapsed = z;
            return this;
        }

        public BigPictureStyle(Builder builder) {
            setBuilder(builder);
        }

        public BigPictureStyle bigPicture(Icon icon) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BigPictureStyle) ipChange.ipc$dispatch("9adcf963", new Object[]{this, icon});
            }
            this.mPictureIcon = IconCompat.createFromIcon(icon);
            return this;
        }

        public BigPictureStyle bigLargeIcon(Icon icon) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BigPictureStyle) ipChange.ipc$dispatch("8e90f4cd", new Object[]{this, icon});
            }
            this.mBigLargeIcon = icon == null ? null : IconCompat.createFromIcon(icon);
            this.mBigLargeIconSet = true;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class BigTextStyle extends Style {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
        private CharSequence mBigText;

        public BigTextStyle() {
        }

        public static /* synthetic */ Object ipc$super(BigTextStyle bigTextStyle, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1337112985) {
                super.addCompatExtras((Bundle) objArr[0]);
                return null;
            } else if (hashCode == -354564456) {
                super.clearCompatExtraKeys((Bundle) objArr[0]);
                return null;
            } else if (hashCode == 1225057360) {
                super.restoreFromCompatExtras((Bundle) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/core/app/NotificationCompat$BigTextStyle");
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b04d4667", new Object[]{this, bundle});
            } else {
                super.addCompatExtras(bundle);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bce7500", new Object[]{this, notificationBuilderWithBuilderAccessor});
                return;
            }
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
            if (this.mSummaryTextSet) {
                bigText.setSummaryText(this.mSummaryText);
            }
        }

        public BigTextStyle bigText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BigTextStyle) ipChange.ipc$dispatch("f109fea6", new Object[]{this, charSequence});
            }
            this.mBigText = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void clearCompatExtraKeys(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eaddc698", new Object[]{this, bundle});
                return;
            }
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public String getClassName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
            }
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void restoreFromCompatExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4904e450", new Object[]{this, bundle});
                return;
            }
            super.restoreFromCompatExtras(bundle);
            this.mBigText = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
        }

        public BigTextStyle setBigContentTitle(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BigTextStyle) ipChange.ipc$dispatch("5b58a216", new Object[]{this, charSequence});
            }
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public BigTextStyle(Builder builder) {
            setBuilder(builder);
        }

        public BigTextStyle setSummaryText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BigTextStyle) ipChange.ipc$dispatch("e45ce18a", new Object[]{this, charSequence});
            }
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class BubbleMetadata {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        private PendingIntent mDeleteIntent;
        private int mDesiredHeight;
        private int mDesiredHeightResId;
        private int mFlags;
        private IconCompat mIcon;
        private PendingIntent mPendingIntent;
        private String mShortcutId;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api29Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api29Impl() {
            }

            public static BubbleMetadata fromPlatform(Notification.BubbleMetadata bubbleMetadata) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (BubbleMetadata) ipChange.ipc$dispatch("a0bc61ee", new Object[]{bubbleMetadata});
                }
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Builder suppressNotification = new Builder(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon())).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }

            public static Notification.BubbleMetadata toPlatform(BubbleMetadata bubbleMetadata) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.BubbleMetadata) ipChange.ipc$dispatch("714aa73d", new Object[]{bubbleMetadata});
                }
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.getIcon().toIcon()).setIntent(bubbleMetadata.getIntent()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api30Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api30Impl() {
            }

            public static BubbleMetadata fromPlatform(Notification.BubbleMetadata bubbleMetadata) {
                Builder builder;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (BubbleMetadata) ipChange.ipc$dispatch("a0bc61ee", new Object[]{bubbleMetadata});
                }
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    builder = new Builder(bubbleMetadata.getShortcutId());
                } else {
                    builder = new Builder(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon()));
                }
                builder.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }

            public static Notification.BubbleMetadata toPlatform(BubbleMetadata bubbleMetadata) {
                Notification.BubbleMetadata.Builder builder;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.BubbleMetadata) ipChange.ipc$dispatch("714aa73d", new Object[]{bubbleMetadata});
                }
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    builder = new Notification.BubbleMetadata.Builder(bubbleMetadata.getShortcutId());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(bubbleMetadata.getIntent(), bubbleMetadata.getIcon().toIcon());
                }
                builder.setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static final class Builder {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private PendingIntent mDeleteIntent;
            private int mDesiredHeight;
            private int mDesiredHeightResId;
            private int mFlags;
            private IconCompat mIcon;
            private PendingIntent mPendingIntent;
            private String mShortcutId;

            @Deprecated
            public Builder() {
            }

            private Builder setFlag(int i, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("4dfc22c6", new Object[]{this, new Integer(i), new Boolean(z)});
                }
                if (z) {
                    this.mFlags = i | this.mFlags;
                } else {
                    this.mFlags = (~i) & this.mFlags;
                }
                return this;
            }

            public BubbleMetadata build() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (BubbleMetadata) ipChange.ipc$dispatch("3d6d67cc", new Object[]{this});
                }
                String str = this.mShortcutId;
                if (str == null && this.mPendingIntent == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                } else if (str == null && this.mIcon == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                } else {
                    BubbleMetadata bubbleMetadata = new BubbleMetadata(this.mPendingIntent, this.mDeleteIntent, this.mIcon, this.mDesiredHeight, this.mDesiredHeightResId, this.mFlags, str);
                    bubbleMetadata.setFlags(this.mFlags);
                    return bubbleMetadata;
                }
            }

            public Builder setAutoExpandBubble(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("b9fa2956", new Object[]{this, new Boolean(z)});
                }
                setFlag(1, z);
                return this;
            }

            public Builder setDeleteIntent(PendingIntent pendingIntent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("d16b172c", new Object[]{this, pendingIntent});
                }
                this.mDeleteIntent = pendingIntent;
                return this;
            }

            public Builder setDesiredHeight(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("1c8ff27d", new Object[]{this, new Integer(i)});
                }
                this.mDesiredHeight = Math.max(i, 0);
                this.mDesiredHeightResId = 0;
                return this;
            }

            public Builder setDesiredHeightResId(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("2bfb740", new Object[]{this, new Integer(i)});
                }
                this.mDesiredHeightResId = i;
                this.mDesiredHeight = 0;
                return this;
            }

            public Builder setIcon(IconCompat iconCompat) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("6c7070ff", new Object[]{this, iconCompat});
                }
                if (this.mShortcutId != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                } else if (iconCompat != null) {
                    this.mIcon = iconCompat;
                    return this;
                } else {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
            }

            public Builder setIntent(PendingIntent pendingIntent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("f39cea17", new Object[]{this, pendingIntent});
                }
                if (this.mShortcutId != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                } else if (pendingIntent != null) {
                    this.mPendingIntent = pendingIntent;
                    return this;
                } else {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
            }

            public Builder setSuppressNotification(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("3de5428b", new Object[]{this, new Boolean(z)});
                }
                setFlag(2, z);
                return this;
            }

            public Builder(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.mShortcutId = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            public Builder(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                } else if (iconCompat != null) {
                    this.mPendingIntent = pendingIntent;
                    this.mIcon = iconCompat;
                } else {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
            }
        }

        public static BubbleMetadata fromPlatform(Notification.BubbleMetadata bubbleMetadata) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BubbleMetadata) ipChange.ipc$dispatch("a0bc61ee", new Object[]{bubbleMetadata});
            }
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return Api30Impl.fromPlatform(bubbleMetadata);
            }
            if (i == 29) {
                return Api29Impl.fromPlatform(bubbleMetadata);
            }
            return null;
        }

        public static Notification.BubbleMetadata toPlatform(BubbleMetadata bubbleMetadata) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return a9k.a(ipChange.ipc$dispatch("714aa73d", new Object[]{bubbleMetadata}));
            }
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return Api30Impl.toPlatform(bubbleMetadata);
            }
            if (i == 29) {
                return Api29Impl.toPlatform(bubbleMetadata);
            }
            return null;
        }

        public boolean getAutoExpandBubble() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("90bd7596", new Object[]{this})).booleanValue();
            }
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        public PendingIntent getDeleteIntent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PendingIntent) ipChange.ipc$dispatch("8eb43110", new Object[]{this});
            }
            return this.mDeleteIntent;
        }

        public int getDesiredHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dfe33a5", new Object[]{this})).intValue();
            }
            return this.mDesiredHeight;
        }

        public int getDesiredHeightResId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("be46c6a", new Object[]{this})).intValue();
            }
            return this.mDesiredHeightResId;
        }

        public IconCompat getIcon() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IconCompat) ipChange.ipc$dispatch("3d431b3d", new Object[]{this});
            }
            return this.mIcon;
        }

        public PendingIntent getIntent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PendingIntent) ipChange.ipc$dispatch("6165a145", new Object[]{this});
            }
            return this.mPendingIntent;
        }

        public String getShortcutId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de557b62", new Object[]{this});
            }
            return this.mShortcutId;
        }

        public boolean isNotificationSuppressed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("29c3b34", new Object[]{this})).booleanValue();
            }
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public void setFlags(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a539337", new Object[]{this, new Integer(i)});
            } else {
                this.mFlags = i;
            }
        }

        private BubbleMetadata(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i, int i2, int i3, String str) {
            this.mPendingIntent = pendingIntent;
            this.mIcon = iconCompat;
            this.mDesiredHeight = i;
            this.mDesiredHeightResId = i2;
            this.mDeleteIntent = pendingIntent2;
            this.mFlags = i3;
            this.mShortcutId = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
        public ArrayList<Action> mActions;
        public boolean mAllowSystemGeneratedContextualActions;
        public int mBadgeIcon;
        public RemoteViews mBigContentView;
        public BubbleMetadata mBubbleMetadata;
        public String mCategory;
        public String mChannelId;
        public boolean mChronometerCountDown;
        public int mColor;
        public boolean mColorized;
        public boolean mColorizedSet;
        public CharSequence mContentInfo;
        public PendingIntent mContentIntent;
        public CharSequence mContentText;
        public CharSequence mContentTitle;
        public RemoteViews mContentView;
        public Context mContext;
        public Bundle mExtras;
        public int mFgsDeferBehavior;
        public PendingIntent mFullScreenIntent;
        public int mGroupAlertBehavior;
        public String mGroupKey;
        public boolean mGroupSummary;
        public RemoteViews mHeadsUpContentView;
        public ArrayList<Action> mInvisibleActions;
        public IconCompat mLargeIcon;
        public boolean mLocalOnly;
        public LocusIdCompat mLocusId;
        public Notification mNotification;
        public int mNumber;
        @Deprecated
        public ArrayList<String> mPeople;
        public ArrayList<Person> mPersonList;
        public int mPriority;
        public int mProgress;
        public boolean mProgressIndeterminate;
        public int mProgressMax;
        public Notification mPublicVersion;
        public CharSequence[] mRemoteInputHistory;
        public CharSequence mSettingsText;
        public String mShortcutId;
        public boolean mShowWhen;
        public boolean mSilent;
        public Object mSmallIcon;
        public String mSortKey;
        public Style mStyle;
        public CharSequence mSubText;
        public RemoteViews mTickerView;
        public long mTimeout;
        public boolean mUseChronometer;
        public int mVisibility;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api21Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api21Impl() {
            }

            public static AudioAttributes build(AudioAttributes.Builder builder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (AudioAttributes) ipChange.ipc$dispatch("1e0c3ae2", new Object[]{builder});
                }
                return builder.build();
            }

            public static AudioAttributes.Builder createBuilder() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (AudioAttributes.Builder) ipChange.ipc$dispatch("ac01cf9e", new Object[0]);
                }
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder setContentType(AudioAttributes.Builder builder, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (AudioAttributes.Builder) ipChange.ipc$dispatch("c2d63fcb", new Object[]{builder, new Integer(i)});
                }
                return builder.setContentType(i);
            }

            public static AudioAttributes.Builder setLegacyStreamType(AudioAttributes.Builder builder, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (AudioAttributes.Builder) ipChange.ipc$dispatch("3bec553f", new Object[]{builder, new Integer(i)});
                }
                return builder.setLegacyStreamType(i);
            }

            public static AudioAttributes.Builder setUsage(AudioAttributes.Builder builder, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (AudioAttributes.Builder) ipChange.ipc$dispatch("5a1ba919", new Object[]{builder, new Integer(i)});
                }
                return builder.setUsage(i);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api23Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api23Impl() {
            }

            public static Icon getLargeIcon(Notification notification) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Icon) ipChange.ipc$dispatch("90d4bc04", new Object[]{notification});
                }
                return notification.getLargeIcon();
            }

            public static Icon getSmallIcon(Notification notification) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Icon) ipChange.ipc$dispatch("3d907bb8", new Object[]{notification});
                }
                return notification.getSmallIcon();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api24Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api24Impl() {
            }

            public static RemoteViews createBigContentView(Notification.Builder builder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RemoteViews) ipChange.ipc$dispatch("f7430be8", new Object[]{builder});
                }
                return builder.createHeadsUpContentView();
            }

            public static RemoteViews createContentView(Notification.Builder builder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RemoteViews) ipChange.ipc$dispatch("3f14d680", new Object[]{builder});
                }
                return builder.createContentView();
            }

            public static RemoteViews createHeadsUpContentView(Notification.Builder builder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RemoteViews) ipChange.ipc$dispatch("1ab88876", new Object[]{builder});
                }
                return builder.createHeadsUpContentView();
            }

            public static Notification.Builder recoverBuilder(Context context, Notification notification) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.Builder) ipChange.ipc$dispatch("d8d18b75", new Object[]{context, notification});
                }
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        public Builder(Context context, Notification notification) {
            this(context, NotificationCompat.getChannelId(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            Style extractStyleFromNotification = Style.extractStyleFromNotification(notification);
            setContentTitle(NotificationCompat.getContentTitle(notification)).setContentText(NotificationCompat.getContentText(notification)).setContentInfo(NotificationCompat.getContentInfo(notification)).setSubText(NotificationCompat.getSubText(notification)).setSettingsText(NotificationCompat.getSettingsText(notification)).setStyle(extractStyleFromNotification).setGroup(NotificationCompat.getGroup(notification)).setGroupSummary(NotificationCompat.isGroupSummary(notification)).setLocusId(NotificationCompat.getLocusId(notification)).setWhen(notification.when).setShowWhen(NotificationCompat.getShowWhen(notification)).setUsesChronometer(NotificationCompat.getUsesChronometer(notification)).setAutoCancel(NotificationCompat.getAutoCancel(notification)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(notification)).setOngoing(NotificationCompat.getOngoing(notification)).setLocalOnly(NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(notification)).setCategory(NotificationCompat.getCategory(notification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, NotificationCompat.getHighPriority(notification)).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(NotificationCompat.getColor(notification)).setVisibility(NotificationCompat.getVisibility(notification)).setPublicVersion(NotificationCompat.getPublicVersion(notification)).setSortKey(NotificationCompat.getSortKey(notification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(notification)).setShortcutId(NotificationCompat.getShortcutId(notification)).setProgress(bundle.getInt(NotificationCompat.EXTRA_PROGRESS_MAX), bundle.getInt(NotificationCompat.EXTRA_PROGRESS), bundle.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(getExtrasWithoutDuplicateData(notification, extractStyleFromNotification));
            if (Build.VERSION.SDK_INT >= 23) {
                this.mSmallIcon = Api23Impl.getSmallIcon(notification);
                Icon largeIcon = Api23Impl.getLargeIcon(notification);
                if (largeIcon != null) {
                    this.mLargeIcon = IconCompat.createFromIcon(largeIcon);
                }
            }
            Notification.Action[] actionArr = notification.actions;
            if (!(actionArr == null || actionArr.length == 0)) {
                for (Notification.Action action : actionArr) {
                    addAction(Action.Builder.fromAndroidAction(action).build());
                }
            }
            List<Action> invisibleActions = NotificationCompat.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                for (Action action2 : invisibleActions) {
                    addInvisibleAction(action2);
                }
            }
            String[] stringArray = notification.extras.getStringArray(NotificationCompat.EXTRA_PEOPLE);
            if (!(stringArray == null || stringArray.length == 0)) {
                for (String str : stringArray) {
                    addPerson(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(NotificationCompat.EXTRA_PEOPLE_LIST)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    addPerson(Person.fromAndroidPerson(x8k.a(it.next())));
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24 && bundle.containsKey(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(bundle.getBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (i >= 26 && bundle.containsKey(NotificationCompat.EXTRA_COLORIZED)) {
                setColorized(bundle.getBoolean(NotificationCompat.EXTRA_COLORIZED));
            }
        }

        private static Bundle getExtrasWithoutDuplicateData(Notification notification, Style style) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("6d7321c4", new Object[]{notification, style});
            }
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(NotificationCompat.EXTRA_TITLE);
            bundle.remove(NotificationCompat.EXTRA_TEXT);
            bundle.remove(NotificationCompat.EXTRA_INFO_TEXT);
            bundle.remove(NotificationCompat.EXTRA_SUB_TEXT);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_ID);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
            bundle.remove(NotificationCompat.EXTRA_SHOW_WHEN);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_MAX);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
            bundle.remove(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
            bundle.remove(NotificationCompat.EXTRA_COLORIZED);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE_LIST);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE);
            bundle.remove(NotificationCompatExtras.EXTRA_SORT_KEY);
            bundle.remove(NotificationCompatExtras.EXTRA_GROUP_KEY);
            bundle.remove(NotificationCompatExtras.EXTRA_GROUP_SUMMARY);
            bundle.remove(NotificationCompatExtras.EXTRA_LOCAL_ONLY);
            bundle.remove(NotificationCompatExtras.EXTRA_ACTION_EXTRAS);
            Bundle bundle2 = bundle.getBundle(CarExtender.EXTRA_CAR_EXTENDER);
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove(CarExtender.EXTRA_INVISIBLE_ACTIONS);
                bundle.putBundle(CarExtender.EXTRA_CAR_EXTENDER, bundle3);
            }
            if (style != null) {
                style.clearCompatExtraKeys(bundle);
            }
            return bundle;
        }

        public static CharSequence limitCharSequenceLength(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("20855217", new Object[]{charSequence});
            }
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > MAX_CHARSEQUENCE_LENGTH) {
                return charSequence.subSequence(0, MAX_CHARSEQUENCE_LENGTH);
            }
            return charSequence;
        }

        private void setFlag(int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f44fe366", new Object[]{this, new Integer(i), new Boolean(z)});
            } else if (z) {
                Notification notification = this.mNotification;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.mNotification;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        private boolean useExistingRemoteView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("729c0fe8", new Object[]{this})).booleanValue();
            }
            Style style = this.mStyle;
            if (style == null || !style.displayCustomViewInline()) {
                return true;
            }
            return false;
        }

        public Builder addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("86f29c76", new Object[]{this, new Integer(i), charSequence, pendingIntent});
            }
            this.mActions.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        public Builder addExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("722f53e0", new Object[]{this, bundle});
            }
            if (bundle != null) {
                Bundle bundle2 = this.mExtras;
                if (bundle2 == null) {
                    this.mExtras = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        public Builder addInvisibleAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("44718c2b", new Object[]{this, new Integer(i), charSequence, pendingIntent});
            }
            this.mInvisibleActions.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        @Deprecated
        public Builder addPerson(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e1b46142", new Object[]{this, str});
            }
            if (str != null && !str.isEmpty()) {
                this.mPeople.add(str);
            }
            return this;
        }

        public Notification build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification) ipChange.ipc$dispatch("4d025bf7", new Object[]{this});
            }
            return new NotificationCompatBuilder(this).build();
        }

        public Builder clearActions() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e5641e32", new Object[]{this});
            }
            this.mActions.clear();
            return this;
        }

        public Builder clearInvisibleActions() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b5582c5", new Object[]{this});
            }
            this.mInvisibleActions.clear();
            Bundle bundle = this.mExtras.getBundle(CarExtender.EXTRA_CAR_EXTENDER);
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove(CarExtender.EXTRA_INVISIBLE_ACTIONS);
                this.mExtras.putBundle(CarExtender.EXTRA_CAR_EXTENDER, bundle2);
            }
            return this;
        }

        public Builder clearPeople() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1effd266", new Object[]{this});
            }
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        public RemoteViews createBigContentView() {
            RemoteViews makeBigContentView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("aea29a47", new Object[]{this});
            }
            if (this.mBigContentView != null && useExistingRemoteView()) {
                return this.mBigContentView;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = this.mStyle;
            if (style != null && (makeBigContentView = style.makeBigContentView(notificationCompatBuilder)) != null) {
                return makeBigContentView;
            }
            Notification build = notificationCompatBuilder.build();
            if (Build.VERSION.SDK_INT >= 24) {
                return Api24Impl.createBigContentView(Api24Impl.recoverBuilder(this.mContext, build));
            }
            return build.bigContentView;
        }

        public RemoteViews createContentView() {
            RemoteViews makeContentView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("f8be8adf", new Object[]{this});
            }
            if (this.mContentView != null && useExistingRemoteView()) {
                return this.mContentView;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = this.mStyle;
            if (style != null && (makeContentView = style.makeContentView(notificationCompatBuilder)) != null) {
                return makeContentView;
            }
            Notification build = notificationCompatBuilder.build();
            if (Build.VERSION.SDK_INT >= 24) {
                return Api24Impl.createContentView(Api24Impl.recoverBuilder(this.mContext, build));
            }
            return build.contentView;
        }

        public RemoteViews createHeadsUpContentView() {
            RemoteViews makeHeadsUpContentView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("88fd9a55", new Object[]{this});
            }
            int i = Build.VERSION.SDK_INT;
            if (this.mHeadsUpContentView != null && useExistingRemoteView()) {
                return this.mHeadsUpContentView;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = this.mStyle;
            if (style != null && (makeHeadsUpContentView = style.makeHeadsUpContentView(notificationCompatBuilder)) != null) {
                return makeHeadsUpContentView;
            }
            Notification build = notificationCompatBuilder.build();
            if (i >= 24) {
                return Api24Impl.createHeadsUpContentView(Api24Impl.recoverBuilder(this.mContext, build));
            }
            return build.headsUpContentView;
        }

        public Builder extend(Extender extender) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("864b5ccf", new Object[]{this, extender});
            }
            extender.extend(this);
            return this;
        }

        public RemoteViews getBigContentView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("7799362d", new Object[]{this});
            }
            return this.mBigContentView;
        }

        public BubbleMetadata getBubbleMetadata() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BubbleMetadata) ipChange.ipc$dispatch("b0c1312f", new Object[]{this});
            }
            return this.mBubbleMetadata;
        }

        public int getColor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("756dbba7", new Object[]{this})).intValue();
            }
            return this.mColor;
        }

        public RemoteViews getContentView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("c591e8b9", new Object[]{this});
            }
            return this.mContentView;
        }

        public Bundle getExtras() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
            }
            if (this.mExtras == null) {
                this.mExtras = new Bundle();
            }
            return this.mExtras;
        }

        public int getForegroundServiceBehavior() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("306e3328", new Object[]{this})).intValue();
            }
            return this.mFgsDeferBehavior;
        }

        public RemoteViews getHeadsUpContentView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("7bd7d33b", new Object[]{this});
            }
            return this.mHeadsUpContentView;
        }

        @Deprecated
        public Notification getNotification() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification) ipChange.ipc$dispatch("f8086fe4", new Object[]{this});
            }
            return build();
        }

        public int getPriority() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
            }
            return this.mPriority;
        }

        public long getWhenIfShowing() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("95a76a93", new Object[]{this})).longValue();
            }
            if (this.mShowWhen) {
                return this.mNotification.when;
            }
            return 0L;
        }

        public Builder setAllowSystemGeneratedContextualActions(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3952a6cf", new Object[]{this, new Boolean(z)});
            }
            this.mAllowSystemGeneratedContextualActions = z;
            return this;
        }

        public Builder setAutoCancel(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d6b74b87", new Object[]{this, new Boolean(z)});
            }
            setFlag(16, z);
            return this;
        }

        public Builder setBadgeIconType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("62209341", new Object[]{this, new Integer(i)});
            }
            this.mBadgeIcon = i;
            return this;
        }

        public Builder setBubbleMetadata(BubbleMetadata bubbleMetadata) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8e2799a6", new Object[]{this, bubbleMetadata});
            }
            this.mBubbleMetadata = bubbleMetadata;
            return this;
        }

        public Builder setCategory(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("41aeb0d8", new Object[]{this, str});
            }
            this.mCategory = str;
            return this;
        }

        public Builder setChannelId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f71a7f9c", new Object[]{this, str});
            }
            this.mChannelId = str;
            return this;
        }

        public Builder setChronometerCountDown(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6cbbeda9", new Object[]{this, new Boolean(z)});
            }
            this.mChronometerCountDown = z;
            getExtras().putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, z);
            return this;
        }

        public Builder setColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("42810b4e", new Object[]{this, new Integer(i)});
            }
            this.mColor = i;
            return this;
        }

        public Builder setColorized(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5efa002d", new Object[]{this, new Boolean(z)});
            }
            this.mColorized = z;
            this.mColorizedSet = true;
            return this;
        }

        public Builder setContent(RemoteViews remoteViews) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("cc506879", new Object[]{this, remoteViews});
            }
            this.mNotification.contentView = remoteViews;
            return this;
        }

        public Builder setContentInfo(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9b61f99", new Object[]{this, charSequence});
            }
            this.mContentInfo = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setContentIntent(PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6d6f9887", new Object[]{this, pendingIntent});
            }
            this.mContentIntent = pendingIntent;
            return this;
        }

        public Builder setContentText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e638d5fa", new Object[]{this, charSequence});
            }
            this.mContentText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setContentTitle(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("63450b3d", new Object[]{this, charSequence});
            }
            this.mContentTitle = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setCustomBigContentView(RemoteViews remoteViews) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("161ad17f", new Object[]{this, remoteViews});
            }
            this.mBigContentView = remoteViews;
            return this;
        }

        public Builder setCustomContentView(RemoteViews remoteViews) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f3c18865", new Object[]{this, remoteViews});
            }
            this.mContentView = remoteViews;
            return this;
        }

        public Builder setCustomHeadsUpContentView(RemoteViews remoteViews) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f723ac8d", new Object[]{this, remoteViews});
            }
            this.mHeadsUpContentView = remoteViews;
            return this;
        }

        public Builder setDefaults(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a4057941", new Object[]{this, new Integer(i)});
            }
            Notification notification = this.mNotification;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public Builder setDeleteIntent(PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("437475fd", new Object[]{this, pendingIntent});
            }
            this.mNotification.deleteIntent = pendingIntent;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fdae1261", new Object[]{this, bundle});
            }
            this.mExtras = bundle;
            return this;
        }

        public Builder setForegroundServiceBehavior(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("48c9470f", new Object[]{this, new Integer(i)});
            }
            this.mFgsDeferBehavior = i;
            return this;
        }

        public Builder setFullScreenIntent(PendingIntent pendingIntent, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e18eb591", new Object[]{this, pendingIntent, new Boolean(z)});
            }
            this.mFullScreenIntent = pendingIntent;
            setFlag(128, z);
            return this;
        }

        public Builder setGroup(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("aec0c7fb", new Object[]{this, str});
            }
            this.mGroupKey = str;
            return this;
        }

        public Builder setGroupAlertBehavior(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("461dc6be", new Object[]{this, new Integer(i)});
            }
            this.mGroupAlertBehavior = i;
            return this;
        }

        public Builder setGroupSummary(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3e2cc2a5", new Object[]{this, new Boolean(z)});
            }
            this.mGroupSummary = z;
            return this;
        }

        public Builder setLargeIcon(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2619acb4", new Object[]{this, bitmap});
            }
            this.mLargeIcon = bitmap == null ? null : IconCompat.createWithBitmap(NotificationCompat.reduceLargeIconSize(this.mContext, bitmap));
            return this;
        }

        public Builder setLights(int i, int i2, int i3) {
            int i4 = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a167cbac", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
            Notification notification = this.mNotification;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (i2 == 0 || i3 == 0) {
                i4 = 0;
            }
            notification.flags = (notification.flags & (-2)) | i4;
            return this;
        }

        public Builder setLocalOnly(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2001d571", new Object[]{this, new Boolean(z)});
            }
            this.mLocalOnly = z;
            return this;
        }

        public Builder setLocusId(LocusIdCompat locusIdCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("92e592c1", new Object[]{this, locusIdCompat});
            }
            this.mLocusId = locusIdCompat;
            return this;
        }

        @Deprecated
        public Builder setNotificationSilent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("72410940", new Object[]{this});
            }
            this.mSilent = true;
            return this;
        }

        public Builder setNumber(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a451aef8", new Object[]{this, new Integer(i)});
            }
            this.mNumber = i;
            return this;
        }

        public Builder setOngoing(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c2ab55b5", new Object[]{this, new Boolean(z)});
            }
            setFlag(2, z);
            return this;
        }

        public Builder setOnlyAlertOnce(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a78b7deb", new Object[]{this, new Boolean(z)});
            }
            setFlag(8, z);
            return this;
        }

        public Builder setPriority(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d26c813", new Object[]{this, new Integer(i)});
            }
            this.mPriority = i;
            return this;
        }

        public Builder setProgress(int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e9307f0b", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            }
            this.mProgressMax = i;
            this.mProgress = i2;
            this.mProgressIndeterminate = z;
            return this;
        }

        public Builder setPublicVersion(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c669a1f", new Object[]{this, notification});
            }
            this.mPublicVersion = notification;
            return this;
        }

        public Builder setRemoteInputHistory(CharSequence[] charSequenceArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("cc10dd49", new Object[]{this, charSequenceArr});
            }
            this.mRemoteInputHistory = charSequenceArr;
            return this;
        }

        public Builder setSettingsText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("33709bcc", new Object[]{this, charSequence});
            }
            this.mSettingsText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setShortcutId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("67177f75", new Object[]{this, str});
            }
            this.mShortcutId = str;
            return this;
        }

        public Builder setShortcutInfo(ShortcutInfoCompat shortcutInfoCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3f1360d", new Object[]{this, shortcutInfoCompat});
            }
            if (shortcutInfoCompat == null) {
                return this;
            }
            this.mShortcutId = shortcutInfoCompat.getId();
            if (this.mLocusId == null) {
                if (shortcutInfoCompat.getLocusId() != null) {
                    this.mLocusId = shortcutInfoCompat.getLocusId();
                } else if (shortcutInfoCompat.getId() != null) {
                    this.mLocusId = new LocusIdCompat(shortcutInfoCompat.getId());
                }
            }
            if (this.mContentTitle == null) {
                setContentTitle(shortcutInfoCompat.getShortLabel());
            }
            return this;
        }

        public Builder setShowWhen(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7fb6af55", new Object[]{this, new Boolean(z)});
            }
            this.mShowWhen = z;
            return this;
        }

        public Builder setSilent(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("422a4cd3", new Object[]{this, new Boolean(z)});
            }
            this.mSilent = z;
            return this;
        }

        public Builder setSmallIcon(IconCompat iconCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ba370787", new Object[]{this, iconCompat});
            }
            this.mSmallIcon = iconCompat.toIcon(this.mContext);
            return this;
        }

        public Builder setSortKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a744bed9", new Object[]{this, str});
            }
            this.mSortKey = str;
            return this;
        }

        public Builder setSound(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4c1f636", new Object[]{this, uri});
            }
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = -1;
            this.mNotification.audioAttributes = Api21Impl.build(Api21Impl.setUsage(Api21Impl.setContentType(Api21Impl.createBuilder(), 4), 5));
            return this;
        }

        public Builder setStyle(Style style) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b8a1b56", new Object[]{this, style});
            }
            if (this.mStyle != style) {
                this.mStyle = style;
                if (style != null) {
                    style.setBuilder(this);
                }
            }
            return this;
        }

        public Builder setSubText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("66917093", new Object[]{this, charSequence});
            }
            this.mSubText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setTicker(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7d7ff072", new Object[]{this, charSequence});
            }
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setTimeoutAfter(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6ffb7889", new Object[]{this, new Long(j)});
            }
            this.mTimeout = j;
            return this;
        }

        public Builder setUsesChronometer(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9eec45d4", new Object[]{this, new Boolean(z)});
            }
            this.mUseChronometer = z;
            return this;
        }

        public Builder setVibrate(long[] jArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d07b9da6", new Object[]{this, jArr});
            }
            this.mNotification.vibrate = jArr;
            return this;
        }

        public Builder setVisibility(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f0c8c181", new Object[]{this, new Integer(i)});
            }
            this.mVisibility = i;
            return this;
        }

        public Builder setWhen(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("92b71b08", new Object[]{this, new Long(j)});
            }
            this.mNotification.when = j;
            return this;
        }

        public Builder addAction(Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a771f7db", new Object[]{this, action});
            }
            if (action != null) {
                this.mActions.add(action);
            }
            return this;
        }

        public Builder addInvisibleAction(Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("cab019c6", new Object[]{this, action});
            }
            if (action != null) {
                this.mInvisibleActions.add(action);
            }
            return this;
        }

        public Builder setSmallIcon(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5b3dedcb", new Object[]{this, new Integer(i)});
            }
            this.mNotification.icon = i;
            return this;
        }

        @Deprecated
        public Builder setTicker(CharSequence charSequence, RemoteViews remoteViews) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1a9db20", new Object[]{this, charSequence, remoteViews});
            }
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            this.mTickerView = remoteViews;
            return this;
        }

        public Builder addPerson(Person person) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("97bdafaa", new Object[]{this, person});
            }
            if (person != null) {
                this.mPersonList.add(person);
            }
            return this;
        }

        public Builder setSmallIcon(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("598ff6e4", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            Notification notification = this.mNotification;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        public Builder setLargeIcon(Icon icon) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ee01c887", new Object[]{this, icon});
            }
            this.mLargeIcon = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        public Builder setSound(Uri uri, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e08cfbd9", new Object[]{this, uri, new Integer(i)});
            }
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = i;
            this.mNotification.audioAttributes = Api21Impl.build(Api21Impl.setLegacyStreamType(Api21Impl.setContentType(Api21Impl.createBuilder(), 4), i));
            return this;
        }

        public Builder(Context context, String str) {
            this.mActions = new ArrayList<>();
            this.mPersonList = new ArrayList<>();
            this.mInvisibleActions = new ArrayList<>();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            this.mFgsDeferBehavior = 0;
            Notification notification = new Notification();
            this.mNotification = notification;
            this.mContext = context;
            this.mChannelId = str;
            notification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList<>();
            this.mAllowSystemGeneratedContextualActions = true;
        }

        @Deprecated
        public Builder(Context context) {
            this(context, (String) null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CallStyle extends Style {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN = 0;
        private static final String KEY_ACTION_PRIORITY = "key_action_priority";
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$CallStyle";
        private Integer mAnswerButtonColor;
        private PendingIntent mAnswerIntent;
        private int mCallType;
        private Integer mDeclineButtonColor;
        private PendingIntent mDeclineIntent;
        private PendingIntent mHangUpIntent;
        private boolean mIsVideo;
        private Person mPerson;
        private IconCompat mVerificationIcon;
        private CharSequence mVerificationText;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api20Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api20Impl() {
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

            public static Notification.Action.Builder createActionBuilder(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.Action.Builder) ipChange.ipc$dispatch("fc0f1d3e", new Object[]{new Integer(i), charSequence, pendingIntent});
                }
                return new Notification.Action.Builder(i, charSequence, pendingIntent);
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
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api23Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api23Impl() {
            }

            public static Parcelable castToParcelable(Icon icon) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Parcelable) ipChange.ipc$dispatch("54d45a50", new Object[]{icon});
                }
                return icon;
            }

            public static Notification.Action.Builder createActionBuilder(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.Action.Builder) ipChange.ipc$dispatch("c3c55e38", new Object[]{icon, charSequence, pendingIntent});
                }
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            public static void setLargeIcon(Notification.Builder builder, Icon icon) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9730e701", new Object[]{builder, icon});
                } else {
                    builder.setLargeIcon(icon);
                }
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

            public static Parcelable castToParcelable(Person person) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Parcelable) ipChange.ipc$dispatch("66ecad33", new Object[]{person});
                }
                return person;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api31Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api31Impl() {
            }

            public static Notification.CallStyle forIncomingCall(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.CallStyle) ipChange.ipc$dispatch("8774f39d", new Object[]{person, pendingIntent, pendingIntent2});
                }
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle forOngoingCall(Person person, PendingIntent pendingIntent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.CallStyle) ipChange.ipc$dispatch("11d15204", new Object[]{person, pendingIntent});
                }
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle forScreeningCall(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.CallStyle) ipChange.ipc$dispatch("127153f", new Object[]{person, pendingIntent, pendingIntent2});
                }
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle setAnswerButtonColorHint(Notification.CallStyle callStyle, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.CallStyle) ipChange.ipc$dispatch("3f2f58e0", new Object[]{callStyle, new Integer(i)});
                }
                return callStyle.setAnswerButtonColorHint(i);
            }

            public static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.Action.Builder) ipChange.ipc$dispatch("47bd43a4", new Object[]{builder, new Boolean(z)});
                }
                return builder.setAuthenticationRequired(z);
            }

            public static Notification.CallStyle setDeclineButtonColorHint(Notification.CallStyle callStyle, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.CallStyle) ipChange.ipc$dispatch("536cdaec", new Object[]{callStyle, new Integer(i)});
                }
                return callStyle.setDeclineButtonColorHint(i);
            }

            public static Notification.CallStyle setIsVideo(Notification.CallStyle callStyle, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.CallStyle) ipChange.ipc$dispatch("41c79506", new Object[]{callStyle, new Boolean(z)});
                }
                return callStyle.setIsVideo(z);
            }

            public static Notification.CallStyle setVerificationIcon(Notification.CallStyle callStyle, Icon icon) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.CallStyle) ipChange.ipc$dispatch("fc413910", new Object[]{callStyle, icon});
                }
                return callStyle.setVerificationIcon(icon);
            }

            public static Notification.CallStyle setVerificationText(Notification.CallStyle callStyle, CharSequence charSequence) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.CallStyle) ipChange.ipc$dispatch("5ac46bc1", new Object[]{callStyle, charSequence});
                }
                return callStyle.setVerificationText(charSequence);
            }
        }

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public @interface CallType {
        }

        public CallStyle() {
        }

        public static CallStyle forIncomingCall(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CallStyle) ipChange.ipc$dispatch("73efe97b", new Object[]{person, pendingIntent, pendingIntent2});
            }
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new CallStyle(1, person, null, pendingIntent, pendingIntent2);
        }

        public static CallStyle forOngoingCall(Person person, PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CallStyle) ipChange.ipc$dispatch("ab30878e", new Object[]{person, pendingIntent});
            }
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new CallStyle(2, person, pendingIntent, null, null);
        }

        public static CallStyle forScreeningCall(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CallStyle) ipChange.ipc$dispatch("c18da69d", new Object[]{person, pendingIntent, pendingIntent2});
            }
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new CallStyle(3, person, pendingIntent, null, pendingIntent2);
        }

        private String getDefaultText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3107f821", new Object[]{this});
            }
            int i = this.mCallType;
            if (i == 1) {
                return this.mBuilder.mContext.getResources().getString(R.string.call_notification_incoming_text);
            }
            if (i == 2) {
                return this.mBuilder.mContext.getResources().getString(R.string.call_notification_ongoing_text);
            }
            if (i != 3) {
                return null;
            }
            return this.mBuilder.mContext.getResources().getString(R.string.call_notification_screening_text);
        }

        public static /* synthetic */ Object ipc$super(CallStyle callStyle, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1337112985) {
                super.addCompatExtras((Bundle) objArr[0]);
                return null;
            } else if (hashCode == 1225057360) {
                super.restoreFromCompatExtras((Bundle) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/core/app/NotificationCompat$CallStyle");
            }
        }

        private Action makeAnswerAction() {
            int i;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Action) ipChange.ipc$dispatch("29d79305", new Object[]{this});
            }
            int i3 = R.drawable.ic_call_answer_video;
            int i4 = R.drawable.ic_call_answer;
            PendingIntent pendingIntent = this.mAnswerIntent;
            if (pendingIntent == null) {
                return null;
            }
            boolean z = this.mIsVideo;
            if (z) {
                i = i3;
            } else {
                i = i4;
            }
            if (z) {
                i2 = R.string.call_notification_answer_video_action;
            } else {
                i2 = R.string.call_notification_answer_action;
            }
            return makeAction(i, i2, this.mAnswerButtonColor, R.color.call_notification_answer_color, pendingIntent);
        }

        private Action makeNegativeAction() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Action) ipChange.ipc$dispatch("6186f4bc", new Object[]{this});
            }
            int i = R.drawable.ic_call_decline;
            PendingIntent pendingIntent = this.mDeclineIntent;
            if (pendingIntent == null) {
                return makeAction(i, R.string.call_notification_hang_up_action, this.mDeclineButtonColor, R.color.call_notification_decline_color, this.mHangUpIntent);
            }
            return makeAction(i, R.string.call_notification_decline_action, this.mDeclineButtonColor, R.color.call_notification_decline_color, pendingIntent);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b04d4667", new Object[]{this, bundle});
                return;
            }
            super.addCompatExtras(bundle);
            bundle.putInt(NotificationCompat.EXTRA_CALL_TYPE, this.mCallType);
            bundle.putBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO, this.mIsVideo);
            Person person = this.mPerson;
            if (person != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON, Api28Impl.castToParcelable(person.toAndroidPerson()));
                } else {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON_COMPAT, person.toBundle());
                }
            }
            IconCompat iconCompat = this.mVerificationIcon;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    bundle.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON, Api23Impl.castToParcelable(iconCompat.toIcon(this.mBuilder.mContext)));
                } else {
                    bundle.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT, iconCompat.toBundle());
                }
            }
            bundle.putCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT, this.mVerificationText);
            bundle.putParcelable(NotificationCompat.EXTRA_ANSWER_INTENT, this.mAnswerIntent);
            bundle.putParcelable(NotificationCompat.EXTRA_DECLINE_INTENT, this.mDeclineIntent);
            bundle.putParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT, this.mHangUpIntent);
            Integer num = this.mAnswerButtonColor;
            if (num != null) {
                bundle.putInt(NotificationCompat.EXTRA_ANSWER_COLOR, num.intValue());
            }
            Integer num2 = this.mDeclineButtonColor;
            if (num2 != null) {
                bundle.putInt(NotificationCompat.EXTRA_DECLINE_COLOR, num2.intValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            CharSequence charSequence;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bce7500", new Object[]{this, notificationBuilderWithBuilderAccessor});
                return;
            }
            int i = Build.VERSION.SDK_INT;
            Notification.CallStyle callStyle = null;
            if (i >= 31) {
                int i2 = this.mCallType;
                if (i2 == 1) {
                    callStyle = Api31Impl.forIncomingCall(this.mPerson.toAndroidPerson(), this.mDeclineIntent, this.mAnswerIntent);
                } else if (i2 == 2) {
                    callStyle = Api31Impl.forOngoingCall(this.mPerson.toAndroidPerson(), this.mHangUpIntent);
                } else if (i2 == 3) {
                    callStyle = Api31Impl.forScreeningCall(this.mPerson.toAndroidPerson(), this.mHangUpIntent, this.mAnswerIntent);
                } else if (Log.isLoggable(NotificationCompat.TAG, 3)) {
                    String.valueOf(this.mCallType);
                }
                if (callStyle != null) {
                    callStyle.setBuilder(notificationBuilderWithBuilderAccessor.getBuilder());
                    Integer num = this.mAnswerButtonColor;
                    if (num != null) {
                        Api31Impl.setAnswerButtonColorHint(callStyle, num.intValue());
                    }
                    Integer num2 = this.mDeclineButtonColor;
                    if (num2 != null) {
                        Api31Impl.setDeclineButtonColorHint(callStyle, num2.intValue());
                    }
                    Api31Impl.setVerificationText(callStyle, this.mVerificationText);
                    IconCompat iconCompat = this.mVerificationIcon;
                    if (iconCompat != null) {
                        Api31Impl.setVerificationIcon(callStyle, iconCompat.toIcon(this.mBuilder.mContext));
                    }
                    Api31Impl.setIsVideo(callStyle, this.mIsVideo);
                    return;
                }
                return;
            }
            Notification.Builder builder = notificationBuilderWithBuilderAccessor.getBuilder();
            Person person = this.mPerson;
            if (person != null) {
                charSequence = person.getName();
            } else {
                charSequence = null;
            }
            builder.setContentTitle(charSequence);
            Bundle bundle = this.mBuilder.mExtras;
            if (bundle != null && bundle.containsKey(NotificationCompat.EXTRA_TEXT)) {
                callStyle = this.mBuilder.mExtras.getCharSequence(NotificationCompat.EXTRA_TEXT);
            }
            if (callStyle == null) {
                callStyle = getDefaultText();
            }
            builder.setContentText(callStyle);
            Person person2 = this.mPerson;
            if (person2 != null) {
                if (i >= 23 && person2.getIcon() != null) {
                    Api23Impl.setLargeIcon(builder, this.mPerson.getIcon().toIcon(this.mBuilder.mContext));
                }
                if (i >= 28) {
                    Api28Impl.addPerson(builder, this.mPerson.toAndroidPerson());
                } else {
                    Api21Impl.addPerson(builder, this.mPerson.getUri());
                }
            }
            Api21Impl.setCategory(builder, "call");
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("243e54dc", new Object[]{this})).booleanValue();
            }
            return true;
        }

        public ArrayList<Action> getActionsListWithSystemActions() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("b3b1bf04", new Object[]{this});
            }
            Action makeNegativeAction = makeNegativeAction();
            Action makeAnswerAction = makeAnswerAction();
            ArrayList<Action> arrayList = new ArrayList<>(3);
            arrayList.add(makeNegativeAction);
            ArrayList<Action> arrayList2 = this.mBuilder.mActions;
            int i = 2;
            if (arrayList2 != null) {
                for (Action action : arrayList2) {
                    if (action.isContextual()) {
                        arrayList.add(action);
                    } else if (!isActionAddedByCallStyle(action) && i > 1) {
                        arrayList.add(action);
                        i--;
                    }
                    if (makeAnswerAction != null && i == 1) {
                        arrayList.add(makeAnswerAction);
                        i--;
                    }
                }
            }
            if (makeAnswerAction != null && i >= 1) {
                arrayList.add(makeAnswerAction);
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public String getClassName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
            }
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void restoreFromCompatExtras(Bundle bundle) {
            Integer num;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4904e450", new Object[]{this, bundle});
                return;
            }
            super.restoreFromCompatExtras(bundle);
            this.mCallType = bundle.getInt(NotificationCompat.EXTRA_CALL_TYPE);
            this.mIsVideo = bundle.getBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28 && bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON)) {
                this.mPerson = Person.fromAndroidPerson(x8k.a(bundle.getParcelable(NotificationCompat.EXTRA_CALL_PERSON)));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON_COMPAT)) {
                this.mPerson = Person.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_CALL_PERSON_COMPAT));
            }
            if (i >= 23 && bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON)) {
                this.mVerificationIcon = IconCompat.createFromIcon(z8k.a(bundle.getParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON)));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT)) {
                this.mVerificationIcon = IconCompat.createFromBundle(bundle.getBundle(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT));
            }
            this.mVerificationText = bundle.getCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT);
            this.mAnswerIntent = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_ANSWER_INTENT);
            this.mDeclineIntent = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_DECLINE_INTENT);
            this.mHangUpIntent = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT);
            Integer num2 = null;
            if (bundle.containsKey(NotificationCompat.EXTRA_ANSWER_COLOR)) {
                num = Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_ANSWER_COLOR));
            } else {
                num = null;
            }
            this.mAnswerButtonColor = num;
            if (bundle.containsKey(NotificationCompat.EXTRA_DECLINE_COLOR)) {
                num2 = Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_DECLINE_COLOR));
            }
            this.mDeclineButtonColor = num2;
        }

        public CallStyle setAnswerButtonColorHint(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CallStyle) ipChange.ipc$dispatch("b212116d", new Object[]{this, new Integer(i)});
            }
            this.mAnswerButtonColor = Integer.valueOf(i);
            return this;
        }

        public CallStyle setDeclineButtonColorHint(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CallStyle) ipChange.ipc$dispatch("1fddf779", new Object[]{this, new Integer(i)});
            }
            this.mDeclineButtonColor = Integer.valueOf(i);
            return this;
        }

        public CallStyle setIsVideo(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CallStyle) ipChange.ipc$dispatch("c6128413", new Object[]{this, new Boolean(z)});
            }
            this.mIsVideo = z;
            return this;
        }

        public CallStyle setVerificationIcon(Icon icon) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CallStyle) ipChange.ipc$dispatch("4c03df4b", new Object[]{this, icon});
            }
            this.mVerificationIcon = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        public CallStyle setVerificationText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CallStyle) ipChange.ipc$dispatch("f2efbd7c", new Object[]{this, charSequence});
            }
            this.mVerificationText = charSequence;
            return this;
        }

        public CallStyle(Builder builder) {
            setBuilder(builder);
        }

        public CallStyle setVerificationIcon(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CallStyle) ipChange.ipc$dispatch("4958c00", new Object[]{this, bitmap});
            }
            this.mVerificationIcon = IconCompat.createWithBitmap(bitmap);
            return this;
        }

        private boolean isActionAddedByCallStyle(Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a27004ad", new Object[]{this, action})).booleanValue();
            }
            return action != null && action.getExtras().getBoolean(KEY_ACTION_PRIORITY);
        }

        private Action makeAction(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Action) ipChange.ipc$dispatch("580c7d21", new Object[]{this, new Integer(i), new Integer(i2), num, new Integer(i3), pendingIntent});
            }
            if (num == null) {
                num = Integer.valueOf(ContextCompat.getColor(this.mBuilder.mContext, i3));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.mBuilder.mContext.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            Action build = new Action.Builder(IconCompat.createWithResource(this.mBuilder.mContext, i), spannableStringBuilder, pendingIntent).build();
            build.getExtras().putBoolean(KEY_ACTION_PRIORITY, true);
            return build;
        }

        private CallStyle(int i, Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (person == null || TextUtils.isEmpty(person.getName())) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.mCallType = i;
            this.mPerson = person;
            this.mAnswerIntent = pendingIntent3;
            this.mDeclineIntent = pendingIntent2;
            this.mHangUpIntent = pendingIntent;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DecoratedCustomViewStyle extends Style {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int MAX_ACTION_BUTTONS = 3;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api24Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api24Impl() {
            }

            public static Notification.Style createDecoratedCustomViewStyle() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.Style) ipChange.ipc$dispatch("fad3b318", new Object[0]);
                }
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        private RemoteViews createRemoteViews(RemoteViews remoteViews, boolean z) {
            int min;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("6a705599", new Object[]{this, remoteViews, new Boolean(z)});
            }
            RemoteViews applyStandardTemplate = applyStandardTemplate(true, R.layout.notification_template_custom_big, false);
            applyStandardTemplate.removeAllViews(R.id.actions);
            List<Action> nonContextualActions = getNonContextualActions(this.mBuilder.mActions);
            if (!z || nonContextualActions == null || (min = Math.min(nonContextualActions.size(), 3)) <= 0) {
                i = 8;
            } else {
                for (int i2 = 0; i2 < min; i2++) {
                    applyStandardTemplate.addView(R.id.actions, generateActionButton(nonContextualActions.get(i2)));
                }
            }
            applyStandardTemplate.setViewVisibility(R.id.actions, i);
            applyStandardTemplate.setViewVisibility(R.id.action_divider, i);
            buildIntoRemoteViews(applyStandardTemplate, remoteViews);
            return applyStandardTemplate;
        }

        private RemoteViews generateActionButton(Action action) {
            int i;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("5b63cd20", new Object[]{this, action});
            }
            if (action.actionIntent != null) {
                z = false;
            }
            String packageName = this.mBuilder.mContext.getPackageName();
            if (z) {
                i = R.layout.notification_action_tombstone;
            } else {
                i = R.layout.notification_action;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            IconCompat iconCompat = action.getIconCompat();
            if (iconCompat != null) {
                remoteViews.setImageViewBitmap(R.id.action_image, createColoredBitmap(iconCompat, R.color.notification_action_color_filter));
            }
            remoteViews.setTextViewText(R.id.action_text, action.title);
            if (!z) {
                remoteViews.setOnClickPendingIntent(R.id.action_container, action.actionIntent);
            }
            remoteViews.setContentDescription(R.id.action_container, action.title);
            return remoteViews;
        }

        private static List<Action> getNonContextualActions(List<Action> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("73a2a21a", new Object[]{list});
            }
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Action action : list) {
                if (!action.isContextual()) {
                    arrayList.add(action);
                }
            }
            return arrayList;
        }

        public static /* synthetic */ Object ipc$super(DecoratedCustomViewStyle decoratedCustomViewStyle, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/app/NotificationCompat$DecoratedCustomViewStyle");
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bce7500", new Object[]{this, notificationBuilderWithBuilderAccessor});
            } else if (Build.VERSION.SDK_INT >= 24) {
                notificationBuilderWithBuilderAccessor.getBuilder().setStyle(Api24Impl.createDecoratedCustomViewStyle());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("243e54dc", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public String getClassName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
            }
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("50998d2a", new Object[]{this, notificationBuilderWithBuilderAccessor});
            }
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews bigContentView = this.mBuilder.getBigContentView();
            if (bigContentView == null) {
                bigContentView = this.mBuilder.getContentView();
            }
            if (bigContentView == null) {
                return null;
            }
            return createRemoteViews(bigContentView, true);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("61b974e6", new Object[]{this, notificationBuilderWithBuilderAccessor});
            }
            if (Build.VERSION.SDK_INT < 24 && this.mBuilder.getContentView() != null) {
                return createRemoteViews(this.mBuilder.getContentView(), false);
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            RemoteViews remoteViews;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("381da8b8", new Object[]{this, notificationBuilderWithBuilderAccessor});
            }
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews headsUpContentView = this.mBuilder.getHeadsUpContentView();
            if (headsUpContentView != null) {
                remoteViews = headsUpContentView;
            } else {
                remoteViews = this.mBuilder.getContentView();
            }
            if (headsUpContentView == null) {
                return null;
            }
            return createRemoteViews(remoteViews, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface Extender {
        Builder extend(Builder builder);
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface GroupAlertBehavior {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class MessagingStyle extends Style {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";
        private CharSequence mConversationTitle;
        private Boolean mIsGroupConversation;
        private Person mUser;
        private final List<Message> mMessages = new ArrayList();
        private final List<Message> mHistoricMessages = new ArrayList();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api24Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api24Impl() {
            }

            public static Notification.MessagingStyle addMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.MessagingStyle) ipChange.ipc$dispatch("25c36f43", new Object[]{messagingStyle, message});
                }
                return messagingStyle.addMessage(message);
            }

            public static Notification.MessagingStyle createMessagingStyle(CharSequence charSequence) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.MessagingStyle) ipChange.ipc$dispatch("488173ad", new Object[]{charSequence});
                }
                return new Notification.MessagingStyle(charSequence);
            }

            public static Notification.MessagingStyle setConversationTitle(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.MessagingStyle) ipChange.ipc$dispatch("5838dcc", new Object[]{messagingStyle, charSequence});
                }
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api26Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api26Impl() {
            }

            public static Notification.MessagingStyle addHistoricMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.MessagingStyle) ipChange.ipc$dispatch("1c34e624", new Object[]{messagingStyle, message});
                }
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api28Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api28Impl() {
            }

            public static Notification.MessagingStyle createMessagingStyle(Person person) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.MessagingStyle) ipChange.ipc$dispatch("da7b6a95", new Object[]{person});
                }
                return new Notification.MessagingStyle(person);
            }

            public static Notification.MessagingStyle setGroupConversation(Notification.MessagingStyle messagingStyle, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Notification.MessagingStyle) ipChange.ipc$dispatch("d32e4b8b", new Object[]{messagingStyle, new Boolean(z)});
                }
                return messagingStyle.setGroupConversation(z);
            }
        }

        public MessagingStyle() {
        }

        public static MessagingStyle extractMessagingStyleFromNotification(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessagingStyle) ipChange.ipc$dispatch("c0839525", new Object[]{notification});
            }
            Style extractStyleFromNotification = Style.extractStyleFromNotification(notification);
            if (extractStyleFromNotification instanceof MessagingStyle) {
                return (MessagingStyle) extractStyleFromNotification;
            }
            return null;
        }

        private Message findLatestIncomingMessage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Message) ipChange.ipc$dispatch("12b31aca", new Object[]{this});
            }
            for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                Message message = this.mMessages.get(size);
                if (!(message.getPerson() == null || TextUtils.isEmpty(message.getPerson().getName()))) {
                    return message;
                }
            }
            if (this.mMessages.isEmpty()) {
                return null;
            }
            List<Message> list = this.mMessages;
            return list.get(list.size() - 1);
        }

        private boolean hasMessagesWithoutSender() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3d808dc2", new Object[]{this})).booleanValue();
            }
            for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                Message message = this.mMessages.get(size);
                if (message.getPerson() != null && message.getPerson().getName() == null) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ Object ipc$super(MessagingStyle messagingStyle, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1337112985) {
                super.addCompatExtras((Bundle) objArr[0]);
                return null;
            } else if (hashCode == -354564456) {
                super.clearCompatExtraKeys((Bundle) objArr[0]);
                return null;
            } else if (hashCode == 1225057360) {
                super.restoreFromCompatExtras((Bundle) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/core/app/NotificationCompat$MessagingStyle");
            }
        }

        private TextAppearanceSpan makeFontColorSpan(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextAppearanceSpan) ipChange.ipc$dispatch("1ec05062", new Object[]{this, new Integer(i)});
            }
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        private CharSequence makeMessageLine(Message message) {
            CharSequence charSequence;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("c0d11bfc", new Object[]{this, message});
            }
            BidiFormatter instance = BidiFormatter.getInstance();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence2 = "";
            if (message.getPerson() == null) {
                charSequence = charSequence2;
            } else {
                charSequence = message.getPerson().getName();
            }
            int i = -16777216;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.mUser.getName();
                if (this.mBuilder.getColor() != 0) {
                    i = this.mBuilder.getColor();
                }
            }
            CharSequence unicodeWrap = instance.unicodeWrap(charSequence);
            spannableStringBuilder.append(unicodeWrap);
            spannableStringBuilder.setSpan(makeFontColorSpan(i), spannableStringBuilder.length() - unicodeWrap.length(), spannableStringBuilder.length(), 33);
            if (message.getText() != null) {
                charSequence2 = message.getText();
            }
            spannableStringBuilder.append((CharSequence) "  ").append(instance.unicodeWrap(charSequence2));
            return spannableStringBuilder;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b04d4667", new Object[]{this, bundle});
                return;
            }
            super.addCompatExtras(bundle);
            bundle.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.mUser.getName());
            bundle.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.mUser.toBundle());
            bundle.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.mConversationTitle);
            if (this.mConversationTitle != null && this.mIsGroupConversation.booleanValue()) {
                bundle.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.mConversationTitle);
            }
            if (!this.mMessages.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, Message.getBundleArrayForMessages(this.mMessages));
            }
            if (!this.mHistoricMessages.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, Message.getBundleArrayForMessages(this.mHistoricMessages));
            }
            Boolean bool = this.mIsGroupConversation;
            if (bool != null) {
                bundle.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
            }
        }

        @Deprecated
        public MessagingStyle addMessage(CharSequence charSequence, long j, CharSequence charSequence2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessagingStyle) ipChange.ipc$dispatch("a052311c", new Object[]{this, charSequence, new Long(j), charSequence2});
            }
            this.mMessages.add(new Message(charSequence, j, new Person.Builder().setName(charSequence2).build()));
            if (this.mMessages.size() > 25) {
                this.mMessages.remove(0);
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            boolean z;
            CharSequence charSequence;
            CharSequence charSequence2;
            Notification.MessagingStyle messagingStyle;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bce7500", new Object[]{this, notificationBuilderWithBuilderAccessor});
                return;
            }
            setGroupConversation(isGroupConversation());
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (i >= 28) {
                    messagingStyle = Api28Impl.createMessagingStyle(this.mUser.toAndroidPerson());
                } else {
                    messagingStyle = Api24Impl.createMessagingStyle(this.mUser.getName());
                }
                for (Message message : this.mMessages) {
                    Api24Impl.addMessage(c9k.a(messagingStyle), message.toAndroidMessage());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    for (Message message2 : this.mHistoricMessages) {
                        Api26Impl.addHistoricMessage(c9k.a(messagingStyle), message2.toAndroidMessage());
                    }
                }
                if (this.mIsGroupConversation.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    Api24Impl.setConversationTitle(c9k.a(messagingStyle), this.mConversationTitle);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    Api28Impl.setGroupConversation(c9k.a(messagingStyle), this.mIsGroupConversation.booleanValue());
                }
                messagingStyle.setBuilder(notificationBuilderWithBuilderAccessor.getBuilder());
                return;
            }
            Message findLatestIncomingMessage = findLatestIncomingMessage();
            if (this.mConversationTitle != null && this.mIsGroupConversation.booleanValue()) {
                notificationBuilderWithBuilderAccessor.getBuilder().setContentTitle(this.mConversationTitle);
            } else if (findLatestIncomingMessage != null) {
                notificationBuilderWithBuilderAccessor.getBuilder().setContentTitle("");
                if (findLatestIncomingMessage.getPerson() != null) {
                    notificationBuilderWithBuilderAccessor.getBuilder().setContentTitle(findLatestIncomingMessage.getPerson().getName());
                }
            }
            if (findLatestIncomingMessage != null) {
                Notification.Builder builder = notificationBuilderWithBuilderAccessor.getBuilder();
                if (this.mConversationTitle != null) {
                    charSequence2 = makeMessageLine(findLatestIncomingMessage);
                } else {
                    charSequence2 = findLatestIncomingMessage.getText();
                }
                builder.setContentText(charSequence2);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.mConversationTitle != null || hasMessagesWithoutSender()) {
                z = true;
            } else {
                z = false;
            }
            for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                Message message3 = this.mMessages.get(size);
                if (z) {
                    charSequence = makeMessageLine(message3);
                } else {
                    charSequence = message3.getText();
                }
                if (size != this.mMessages.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, charSequence);
            }
            new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(null).bigText(spannableStringBuilder);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void clearCompatExtraKeys(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eaddc698", new Object[]{this, bundle});
                return;
            }
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            bundle.remove(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            bundle.remove(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public String getClassName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
            }
            return TEMPLATE_CLASS_NAME;
        }

        public CharSequence getConversationTitle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("ffe8f114", new Object[]{this});
            }
            return this.mConversationTitle;
        }

        public List<Message> getHistoricMessages() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("b29952ff", new Object[]{this});
            }
            return this.mHistoricMessages;
        }

        public List<Message> getMessages() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("200444de", new Object[]{this});
            }
            return this.mMessages;
        }

        public Person getUser() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Person) ipChange.ipc$dispatch("19172df0", new Object[]{this});
            }
            return this.mUser;
        }

        @Deprecated
        public CharSequence getUserDisplayName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("4ab29067", new Object[]{this});
            }
            return this.mUser.getName();
        }

        public boolean isGroupConversation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("95a5c523", new Object[]{this})).booleanValue();
            }
            Builder builder = this.mBuilder;
            if (builder == null || builder.mContext.getApplicationInfo().targetSdkVersion >= 28 || this.mIsGroupConversation != null) {
                Boolean bool = this.mIsGroupConversation;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } else if (this.mConversationTitle != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void restoreFromCompatExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4904e450", new Object[]{this, bundle});
                return;
            }
            super.restoreFromCompatExtras(bundle);
            this.mMessages.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                this.mUser = Person.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
            } else {
                this.mUser = new Person.Builder().setName(bundle.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME)).build();
            }
            CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            this.mConversationTitle = charSequence;
            if (charSequence == null) {
                this.mConversationTitle = bundle.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
            if (parcelableArray != null) {
                this.mMessages.addAll(Message.getMessagesFromBundleArray(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (parcelableArray2 != null) {
                this.mHistoricMessages.addAll(Message.getMessagesFromBundleArray(parcelableArray2));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
                this.mIsGroupConversation = Boolean.valueOf(bundle.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        public MessagingStyle setConversationTitle(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessagingStyle) ipChange.ipc$dispatch("a4d55363", new Object[]{this, charSequence});
            }
            this.mConversationTitle = charSequence;
            return this;
        }

        public MessagingStyle setGroupConversation(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessagingStyle) ipChange.ipc$dispatch("4b1903b2", new Object[]{this, new Boolean(z)});
            }
            this.mIsGroupConversation = Boolean.valueOf(z);
            return this;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static final class Message {
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            public static final String KEY_DATA_MIME_TYPE = "type";
            public static final String KEY_DATA_URI = "uri";
            public static final String KEY_EXTRAS_BUNDLE = "extras";
            public static final String KEY_NOTIFICATION_PERSON = "sender_person";
            public static final String KEY_PERSON = "person";
            public static final String KEY_SENDER = "sender";
            public static final String KEY_TEXT = "text";
            public static final String KEY_TIMESTAMP = "time";
            private String mDataMimeType;
            private Uri mDataUri;
            private Bundle mExtras;
            private final Person mPerson;
            private final CharSequence mText;
            private final long mTimestamp;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
            public static class Api24Impl {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private Api24Impl() {
                }

                public static Notification.MessagingStyle.Message createMessage(CharSequence charSequence, long j, CharSequence charSequence2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Notification.MessagingStyle.Message) ipChange.ipc$dispatch("d060c008", new Object[]{charSequence, new Long(j), charSequence2});
                    }
                    return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
                }

                public static Notification.MessagingStyle.Message setData(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Notification.MessagingStyle.Message) ipChange.ipc$dispatch("951838e0", new Object[]{message, str, uri});
                    }
                    return message.setData(str, uri);
                }
            }

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
            public static class Api28Impl {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private Api28Impl() {
                }

                public static Parcelable castToParcelable(android.app.Person person) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Parcelable) ipChange.ipc$dispatch("66ecad33", new Object[]{person});
                    }
                    return person;
                }

                public static Notification.MessagingStyle.Message createMessage(CharSequence charSequence, long j, android.app.Person person) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Notification.MessagingStyle.Message) ipChange.ipc$dispatch("8d959df0", new Object[]{charSequence, new Long(j), person});
                    }
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }
            }

            public Message(CharSequence charSequence, long j, Person person) {
                this.mExtras = new Bundle();
                this.mText = charSequence;
                this.mTimestamp = j;
                this.mPerson = person;
            }

            public static Message getMessageFromBundle(Bundle bundle) {
                Person person;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Message) ipChange.ipc$dispatch("caaf3552", new Object[]{bundle});
                }
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey(KEY_PERSON)) {
                            person = Person.fromBundle(bundle.getBundle(KEY_PERSON));
                        } else if (!bundle.containsKey(KEY_NOTIFICATION_PERSON) || Build.VERSION.SDK_INT < 28) {
                            person = bundle.containsKey("sender") ? new Person.Builder().setName(bundle.getCharSequence("sender")).build() : null;
                        } else {
                            person = Person.fromAndroidPerson(x8k.a(bundle.getParcelable(KEY_NOTIFICATION_PERSON)));
                        }
                        Message message = new Message(bundle.getCharSequence("text"), bundle.getLong("time"), person);
                        if (bundle.containsKey("type") && bundle.containsKey(KEY_DATA_URI)) {
                            message.setData(bundle.getString("type"), (Uri) bundle.getParcelable(KEY_DATA_URI));
                        }
                        if (bundle.containsKey("extras")) {
                            message.getExtras().putAll(bundle.getBundle("extras"));
                        }
                        return message;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            public static List<Message> getMessagesFromBundleArray(Parcelable[] parcelableArr) {
                Message messageFromBundle;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (List) ipChange.ipc$dispatch("66f41d7", new Object[]{parcelableArr});
                }
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (messageFromBundle = getMessageFromBundle((Bundle) parcelable)) != null) {
                        arrayList.add(messageFromBundle);
                    }
                }
                return arrayList;
            }

            private Bundle toBundle() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Bundle) ipChange.ipc$dispatch("39245ca8", new Object[]{this});
                }
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.mText;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.mTimestamp);
                Person person = this.mPerson;
                if (person != null) {
                    bundle.putCharSequence("sender", person.getName());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(KEY_NOTIFICATION_PERSON, Api28Impl.castToParcelable(this.mPerson.toAndroidPerson()));
                    } else {
                        bundle.putBundle(KEY_PERSON, this.mPerson.toBundle());
                    }
                }
                String str = this.mDataMimeType;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.mDataUri;
                if (uri != null) {
                    bundle.putParcelable(KEY_DATA_URI, uri);
                }
                Bundle bundle2 = this.mExtras;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String getDataMimeType() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("df3271eb", new Object[]{this});
                }
                return this.mDataMimeType;
            }

            public Uri getDataUri() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Uri) ipChange.ipc$dispatch("c13592ea", new Object[]{this});
                }
                return this.mDataUri;
            }

            public Bundle getExtras() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
                }
                return this.mExtras;
            }

            public Person getPerson() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Person) ipChange.ipc$dispatch("f4f1b826", new Object[]{this});
                }
                return this.mPerson;
            }

            @Deprecated
            public CharSequence getSender() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (CharSequence) ipChange.ipc$dispatch("f3e85b48", new Object[]{this});
                }
                Person person = this.mPerson;
                if (person == null) {
                    return null;
                }
                return person.getName();
            }

            public CharSequence getText() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this});
                }
                return this.mText;
            }

            public long getTimestamp() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue();
                }
                return this.mTimestamp;
            }

            public Message setData(String str, Uri uri) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Message) ipChange.ipc$dispatch("6dc3fbac", new Object[]{this, str, uri});
                }
                this.mDataMimeType = str;
                this.mDataUri = uri;
                return this;
            }

            public Notification.MessagingStyle.Message toAndroidMessage() {
                Notification.MessagingStyle.Message message;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return d9k.a(ipChange.ipc$dispatch("c0dcb5f0", new Object[]{this}));
                }
                Person person = getPerson();
                CharSequence charSequence = null;
                android.app.Person person2 = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence text = getText();
                    long timestamp = getTimestamp();
                    if (person != null) {
                        person2 = person.toAndroidPerson();
                    }
                    message = Api28Impl.createMessage(text, timestamp, person2);
                } else {
                    CharSequence text2 = getText();
                    long timestamp2 = getTimestamp();
                    if (person != null) {
                        charSequence = person.getName();
                    }
                    message = Api24Impl.createMessage(text2, timestamp2, charSequence);
                }
                if (getDataMimeType() != null) {
                    Api24Impl.setData(message, getDataMimeType(), getDataUri());
                }
                return message;
            }

            public static Bundle[] getBundleArrayForMessages(List<Message> list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Bundle[]) ipChange.ipc$dispatch("df4585c9", new Object[]{list});
                }
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).toBundle();
                }
                return bundleArr;
            }

            @Deprecated
            public Message(CharSequence charSequence, long j, CharSequence charSequence2) {
                this(charSequence, j, new Person.Builder().setName(charSequence2).build());
            }
        }

        public MessagingStyle addHistoricMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessagingStyle) ipChange.ipc$dispatch("e8e36aa9", new Object[]{this, message});
            }
            if (message != null) {
                this.mHistoricMessages.add(message);
                if (this.mHistoricMessages.size() > 25) {
                    this.mHistoricMessages.remove(0);
                }
            }
            return this;
        }

        @Deprecated
        public MessagingStyle(CharSequence charSequence) {
            this.mUser = new Person.Builder().setName(charSequence).build();
        }

        public MessagingStyle addMessage(CharSequence charSequence, long j, Person person) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessagingStyle) ipChange.ipc$dispatch("5d59f01a", new Object[]{this, charSequence, new Long(j), person});
            }
            addMessage(new Message(charSequence, j, person));
            return this;
        }

        public MessagingStyle addMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessagingStyle) ipChange.ipc$dispatch("4c47e3aa", new Object[]{this, message});
            }
            if (message != null) {
                this.mMessages.add(message);
                if (this.mMessages.size() > 25) {
                    this.mMessages.remove(0);
                }
            }
            return this;
        }

        public MessagingStyle(Person person) {
            if (!TextUtils.isEmpty(person.getName())) {
                this.mUser = person;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface NotificationVisibility {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface ServiceNotificationBehavior {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface StreamType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class Style {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public CharSequence mBigContentTitle;
        public Builder mBuilder;
        public CharSequence mSummaryText;
        public boolean mSummaryTextSet = false;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api24Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api24Impl() {
            }

            public static void setChronometerCountDown(RemoteViews remoteViews, int i, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c33da777", new Object[]{remoteViews, new Integer(i), new Boolean(z)});
                } else {
                    remoteViews.setChronometerCountDown(i, z);
                }
            }
        }

        private int calculateTopPadding() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a397647c", new Object[]{this})).intValue();
            }
            Resources resources = this.mBuilder.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float constrain = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - constrain) * dimensionPixelSize) + (constrain * dimensionPixelSize2));
        }

        private static float constrain(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fa4d6c72", new Object[]{new Float(f), new Float(f2), new Float(f3)})).floatValue();
            }
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
            if (r4.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle") == false) goto L_0x001f;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static androidx.core.app.NotificationCompat.Style constructCompatStyleByName(java.lang.String r4) {
            /*
                r0 = 0
                r1 = 1
                com.android.alibaba.ip.runtime.IpChange r2 = androidx.core.app.NotificationCompat.Style.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0015
                java.lang.String r3 = "c115fda8"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r4
                java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
                androidx.core.app.NotificationCompat$Style r4 = (androidx.core.app.NotificationCompat.Style) r4
                return r4
            L_0x0015:
                if (r4 == 0) goto L_0x0089
                r2 = -1
                int r3 = r4.hashCode()
                switch(r3) {
                    case -716705180: goto L_0x0058;
                    case -171946061: goto L_0x004d;
                    case 714386739: goto L_0x0042;
                    case 912942987: goto L_0x0037;
                    case 919595044: goto L_0x002c;
                    case 2090799565: goto L_0x0021;
                    default: goto L_0x001f;
                }
            L_0x001f:
                r0 = -1
                goto L_0x0061
            L_0x0021:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$MessagingStyle"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x002a
                goto L_0x001f
            L_0x002a:
                r0 = 5
                goto L_0x0061
            L_0x002c:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigTextStyle"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0035
                goto L_0x001f
            L_0x0035:
                r0 = 4
                goto L_0x0061
            L_0x0037:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$InboxStyle"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0040
                goto L_0x001f
            L_0x0040:
                r0 = 3
                goto L_0x0061
            L_0x0042:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$CallStyle"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x004b
                goto L_0x001f
            L_0x004b:
                r0 = 2
                goto L_0x0061
            L_0x004d:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigPictureStyle"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0056
                goto L_0x001f
            L_0x0056:
                r0 = 1
                goto L_0x0061
            L_0x0058:
                java.lang.String r1 = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"
                boolean r4 = r4.equals(r1)
                if (r4 != 0) goto L_0x0061
                goto L_0x001f
            L_0x0061:
                switch(r0) {
                    case 0: goto L_0x0083;
                    case 1: goto L_0x007d;
                    case 2: goto L_0x0077;
                    case 3: goto L_0x0071;
                    case 4: goto L_0x006b;
                    case 5: goto L_0x0065;
                    default: goto L_0x0064;
                }
            L_0x0064:
                goto L_0x0089
            L_0x0065:
                androidx.core.app.NotificationCompat$MessagingStyle r4 = new androidx.core.app.NotificationCompat$MessagingStyle
                r4.<init>()
                return r4
            L_0x006b:
                androidx.core.app.NotificationCompat$BigTextStyle r4 = new androidx.core.app.NotificationCompat$BigTextStyle
                r4.<init>()
                return r4
            L_0x0071:
                androidx.core.app.NotificationCompat$InboxStyle r4 = new androidx.core.app.NotificationCompat$InboxStyle
                r4.<init>()
                return r4
            L_0x0077:
                androidx.core.app.NotificationCompat$CallStyle r4 = new androidx.core.app.NotificationCompat$CallStyle
                r4.<init>()
                return r4
            L_0x007d:
                androidx.core.app.NotificationCompat$BigPictureStyle r4 = new androidx.core.app.NotificationCompat$BigPictureStyle
                r4.<init>()
                return r4
            L_0x0083:
                androidx.core.app.NotificationCompat$DecoratedCustomViewStyle r4 = new androidx.core.app.NotificationCompat$DecoratedCustomViewStyle
                r4.<init>()
                return r4
            L_0x0089:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Style.constructCompatStyleByName(java.lang.String):androidx.core.app.NotificationCompat$Style");
        }

        private static Style constructCompatStyleByPlatformName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Style) ipChange.ipc$dispatch("57aabf5", new Object[]{str});
            }
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new BigPictureStyle();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new BigTextStyle();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new InboxStyle();
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (str.equals(e9k.a().getName())) {
                    return new MessagingStyle();
                }
                if (str.equals(f9k.a().getName())) {
                    return new DecoratedCustomViewStyle();
                }
            }
            return null;
        }

        public static Style constructCompatStyleForBundle(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Style) ipChange.ipc$dispatch("9b6d84f9", new Object[]{bundle});
            }
            Style constructCompatStyleByName = constructCompatStyleByName(bundle.getString(NotificationCompat.EXTRA_COMPAT_TEMPLATE));
            if (constructCompatStyleByName != null) {
                return constructCompatStyleByName;
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_SELF_DISPLAY_NAME) || bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                return new MessagingStyle();
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_PICTURE) || bundle.containsKey(NotificationCompat.EXTRA_PICTURE_ICON)) {
                return new BigPictureStyle();
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_BIG_TEXT)) {
                return new BigTextStyle();
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                return new InboxStyle();
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_CALL_TYPE)) {
                return new CallStyle();
            }
            return constructCompatStyleByPlatformName(bundle.getString(NotificationCompat.EXTRA_TEMPLATE));
        }

        public static Style constructStyleForExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Style) ipChange.ipc$dispatch("489b3838", new Object[]{bundle});
            }
            Style constructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
            if (constructCompatStyleForBundle == null) {
                return null;
            }
            try {
                constructCompatStyleForBundle.restoreFromCompatExtras(bundle);
                return constructCompatStyleForBundle;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap createIconWithBackground(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("80c2d12e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            int i5 = R.drawable.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap createColoredBitmap = createColoredBitmap(i5, i4, i2);
            Canvas canvas = new Canvas(createColoredBitmap);
            Drawable mutate = this.mBuilder.mContext.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return createColoredBitmap;
        }

        public static Style extractStyleFromNotification(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Style) ipChange.ipc$dispatch("99b37ef1", new Object[]{notification});
            }
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return constructStyleForExtras(extras);
        }

        private void hideNormalContent(RemoteViews remoteViews) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f26c289", new Object[]{this, remoteViews});
                return;
            }
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setViewVisibility(R.id.text2, 8);
            remoteViews.setViewVisibility(R.id.text, 8);
        }

        public void addCompatExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b04d4667", new Object[]{this, bundle});
                return;
            }
            if (this.mSummaryTextSet) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.mSummaryText);
            }
            CharSequence charSequence = this.mBigContentTitle;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String className = getClassName();
            if (className != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, className);
            }
        }

        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bce7500", new Object[]{this, notificationBuilderWithBuilderAccessor});
            }
        }

        public Notification build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification) ipChange.ipc$dispatch("4d025bf7", new Object[]{this});
            }
            Builder builder = this.mBuilder;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }

        public void clearCompatExtraKeys(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eaddc698", new Object[]{this, bundle});
                return;
            }
            bundle.remove(NotificationCompat.EXTRA_SUMMARY_TEXT);
            bundle.remove(NotificationCompat.EXTRA_TITLE_BIG);
            bundle.remove(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        public Bitmap createColoredBitmap(int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("aaf509ba", new Object[]{this, new Integer(i), new Integer(i2)}) : createColoredBitmap(i, i2, 0);
        }

        public boolean displayCustomViewInline() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("243e54dc", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public String getClassName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
            }
            return null;
        }

        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("50998d2a", new Object[]{this, notificationBuilderWithBuilderAccessor});
            }
            return null;
        }

        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("61b974e6", new Object[]{this, notificationBuilderWithBuilderAccessor});
            }
            return null;
        }

        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteViews) ipChange.ipc$dispatch("381da8b8", new Object[]{this, notificationBuilderWithBuilderAccessor});
            }
            return null;
        }

        public void restoreFromCompatExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4904e450", new Object[]{this, bundle});
                return;
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_SUMMARY_TEXT)) {
                this.mSummaryText = bundle.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT);
                this.mSummaryTextSet = true;
            }
            this.mBigContentTitle = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
        }

        public void setBuilder(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7e9d193", new Object[]{this, builder});
            } else if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }

        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4fa12a5", new Object[]{this, remoteViews, remoteViews2});
                return;
            }
            hideNormalContent(remoteViews);
            int i = R.id.notification_main_column;
            remoteViews.removeAllViews(i);
            remoteViews.addView(i, remoteViews2.clone());
            remoteViews.setViewVisibility(i, 0);
            remoteViews.setViewPadding(R.id.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
        }

        public Bitmap createColoredBitmap(IconCompat iconCompat, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("6724ce68", new Object[]{this, iconCompat, new Integer(i)}) : createColoredBitmap(iconCompat, i, 0);
        }

        private Bitmap createColoredBitmap(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("63234985", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)}) : createColoredBitmap(IconCompat.createWithResource(this.mBuilder.mContext, i), i2, i3);
        }

        private Bitmap createColoredBitmap(IconCompat iconCompat, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("2cec1a97", new Object[]{this, iconCompat, new Integer(i), new Integer(i2)});
            }
            Drawable loadDrawable = iconCompat.loadDrawable(this.mBuilder.mContext);
            int intrinsicWidth = i2 == 0 ? loadDrawable.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = loadDrawable.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            loadDrawable.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                loadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            loadDrawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01c1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews applyStandardTemplate(boolean r13, int r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 455
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Style.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class WearableExtender implements Extender {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final String KEY_ACTIONS = "actions";
        private static final String KEY_BACKGROUND = "background";
        private static final String KEY_BRIDGE_TAG = "bridgeTag";
        private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final String KEY_CONTENT_ICON = "contentIcon";
        private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final String KEY_DISMISSAL_ID = "dismissalId";
        private static final String KEY_DISPLAY_INTENT = "displayIntent";
        private static final String KEY_FLAGS = "flags";
        private static final String KEY_GRAVITY = "gravity";
        private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final String KEY_PAGES = "pages";
        @Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;
        @Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;
        @Deprecated
        public static final int SIZE_DEFAULT = 0;
        @Deprecated
        public static final int SIZE_FULL_SCREEN = 5;
        @Deprecated
        public static final int SIZE_LARGE = 4;
        @Deprecated
        public static final int SIZE_MEDIUM = 3;
        @Deprecated
        public static final int SIZE_SMALL = 2;
        @Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private ArrayList<Action> mActions;
        private Bitmap mBackground;
        private String mBridgeTag;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private String mDismissalId;
        private PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private ArrayList<Notification> mPages;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api20Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api20Impl() {
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

            public static Action getActionCompatFromAction(ArrayList<Parcelable> arrayList, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Action) ipChange.ipc$dispatch("fe6036aa", new Object[]{arrayList, new Integer(i)});
                }
                return NotificationCompat.getActionCompatFromAction((Notification.Action) arrayList.get(i));
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
        }

        public WearableExtender() {
            this.mActions = new ArrayList<>();
            this.mFlags = 1;
            this.mPages = new ArrayList<>();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
        }

        private void setFlag(int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f44fe366", new Object[]{this, new Integer(i), new Boolean(z)});
            } else if (z) {
                this.mFlags = i | this.mFlags;
            } else {
                this.mFlags = (~i) & this.mFlags;
            }
        }

        public WearableExtender addAction(Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("6cb2500", new Object[]{this, action});
            }
            this.mActions.add(action);
            return this;
        }

        public WearableExtender addActions(List<Action> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("ed6300e6", new Object[]{this, list});
            }
            this.mActions.addAll(list);
            return this;
        }

        @Deprecated
        public WearableExtender addPage(Notification notification) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("9800319f", new Object[]{this, notification});
            }
            this.mPages.add(notification);
            return this;
        }

        @Deprecated
        public WearableExtender addPages(List<Notification> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("18a62ead", new Object[]{this, list});
            }
            this.mPages.addAll(list);
            return this;
        }

        public WearableExtender clearActions() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("44d93089", new Object[]{this});
            }
            this.mActions.clear();
            return this;
        }

        @Deprecated
        public WearableExtender clearPages() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("7f62b150", new Object[]{this});
            }
            this.mPages.clear();
            return this;
        }

        public List<Action> getActions() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
            }
            return this.mActions;
        }

        @Deprecated
        public Bitmap getBackground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("425e1d89", new Object[]{this});
            }
            return this.mBackground;
        }

        public String getBridgeTag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1bb5313e", new Object[]{this});
            }
            return this.mBridgeTag;
        }

        public int getContentAction() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cb40c53", new Object[]{this})).intValue();
            }
            return this.mContentActionIndex;
        }

        @Deprecated
        public int getContentIcon() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("48c9bdd6", new Object[]{this})).intValue();
            }
            return this.mContentIcon;
        }

        @Deprecated
        public int getContentIconGravity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5faf8ecc", new Object[]{this})).intValue();
            }
            return this.mContentIconGravity;
        }

        public boolean getContentIntentAvailableOffline() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("823b11c4", new Object[]{this})).booleanValue();
            }
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public int getCustomContentHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("80e03d3", new Object[]{this})).intValue();
            }
            return this.mCustomContentHeight;
        }

        @Deprecated
        public int getCustomSizePreset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("72780901", new Object[]{this})).intValue();
            }
            return this.mCustomSizePreset;
        }

        public String getDismissalId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("55c8543f", new Object[]{this});
            }
            return this.mDismissalId;
        }

        @Deprecated
        public PendingIntent getDisplayIntent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PendingIntent) ipChange.ipc$dispatch("55fe837b", new Object[]{this});
            }
            return this.mDisplayIntent;
        }

        @Deprecated
        public int getGravity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19666692", new Object[]{this})).intValue();
            }
            return this.mGravity;
        }

        @Deprecated
        public boolean getHintAmbientBigPicture() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9b7ecb24", new Object[]{this})).booleanValue();
            }
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }

        public boolean getHintContentIntentLaunchesActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("78fddef3", new Object[]{this})).booleanValue();
            }
            if ((this.mFlags & 64) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean getHintHideIcon() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4604c383", new Object[]{this})).booleanValue();
            }
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public int getHintScreenTimeout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6f5017d2", new Object[]{this})).intValue();
            }
            return this.mHintScreenTimeout;
        }

        @Deprecated
        public List<Notification> getPages() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("51843212", new Object[]{this});
            }
            return this.mPages;
        }

        public boolean getStartScrollBottom() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b0d14eaf", new Object[]{this})).booleanValue();
            }
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public WearableExtender setBackground(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("78153069", new Object[]{this, bitmap});
            }
            this.mBackground = bitmap;
            return this;
        }

        public WearableExtender setBridgeTag(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("c68b43b2", new Object[]{this, str});
            }
            this.mBridgeTag = str;
            return this;
        }

        public WearableExtender setContentAction(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("b876d4c1", new Object[]{this, new Integer(i)});
            }
            this.mContentActionIndex = i;
            return this;
        }

        @Deprecated
        public WearableExtender setContentIcon(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("df3f3ede", new Object[]{this, new Integer(i)});
            }
            this.mContentIcon = i;
            return this;
        }

        @Deprecated
        public WearableExtender setContentIconGravity(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("8b1d0390", new Object[]{this, new Integer(i)});
            }
            this.mContentIconGravity = i;
            return this;
        }

        public WearableExtender setContentIntentAvailableOffline(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("37b64472", new Object[]{this, new Boolean(z)});
            }
            setFlag(1, z);
            return this;
        }

        @Deprecated
        public WearableExtender setCustomContentHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("4ba27441", new Object[]{this, new Integer(i)});
            }
            this.mCustomContentHeight = i;
            return this;
        }

        @Deprecated
        public WearableExtender setCustomSizePreset(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("dfb97ebb", new Object[]{this, new Integer(i)});
            }
            this.mCustomSizePreset = i;
            return this;
        }

        public WearableExtender setDismissalId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("e4a84691", new Object[]{this, str});
            }
            this.mDismissalId = str;
            return this;
        }

        @Deprecated
        public WearableExtender setDisplayIntent(PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("201c03eb", new Object[]{this, pendingIntent});
            }
            this.mDisplayIntent = pendingIntent;
            return this;
        }

        @Deprecated
        public WearableExtender setGravity(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("14ae58a2", new Object[]{this, new Integer(i)});
            }
            this.mGravity = i;
            return this;
        }

        @Deprecated
        public WearableExtender setHintAmbientBigPicture(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("f5254b12", new Object[]{this, new Boolean(z)});
            }
            setFlag(32, z);
            return this;
        }

        @Deprecated
        public WearableExtender setHintAvoidBackgroundClipping(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("46a27923", new Object[]{this, new Boolean(z)});
            }
            setFlag(16, z);
            return this;
        }

        public WearableExtender setHintContentIntentLaunchesActivity(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("a156a863", new Object[]{this, new Boolean(z)});
            }
            setFlag(64, z);
            return this;
        }

        @Deprecated
        public WearableExtender setHintHideIcon(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("8fee8c3b", new Object[]{this, new Boolean(z)});
            }
            setFlag(2, z);
            return this;
        }

        @Deprecated
        public WearableExtender setHintScreenTimeout(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("6f9e2062", new Object[]{this, new Integer(i)});
            }
            this.mHintScreenTimeout = i;
            return this;
        }

        @Deprecated
        public WearableExtender setHintShowBackgroundOnly(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("7f68687f", new Object[]{this, new Boolean(z)});
            }
            setFlag(4, z);
            return this;
        }

        public WearableExtender setStartScrollBottom(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("bc96cd27", new Object[]{this, new Boolean(z)});
            }
            setFlag(8, z);
            return this;
        }

        public WearableExtender clone() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WearableExtender) ipChange.ipc$dispatch("3bec91b6", new Object[]{this});
            }
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.mActions = new ArrayList<>(this.mActions);
            wearableExtender.mFlags = this.mFlags;
            wearableExtender.mDisplayIntent = this.mDisplayIntent;
            wearableExtender.mPages = new ArrayList<>(this.mPages);
            wearableExtender.mBackground = this.mBackground;
            wearableExtender.mContentIcon = this.mContentIcon;
            wearableExtender.mContentIconGravity = this.mContentIconGravity;
            wearableExtender.mContentActionIndex = this.mContentActionIndex;
            wearableExtender.mCustomSizePreset = this.mCustomSizePreset;
            wearableExtender.mCustomContentHeight = this.mCustomContentHeight;
            wearableExtender.mGravity = this.mGravity;
            wearableExtender.mHintScreenTimeout = this.mHintScreenTimeout;
            wearableExtender.mDismissalId = this.mDismissalId;
            wearableExtender.mBridgeTag = this.mBridgeTag;
            return wearableExtender;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public Builder extend(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b14c5a35", new Object[]{this, builder});
            }
            Bundle bundle = new Bundle();
            if (!this.mActions.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.mActions.size());
                Iterator<Action> it = this.mActions.iterator();
                while (it.hasNext()) {
                    arrayList.add(getActionFromActionCompat(it.next()));
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i = this.mFlags;
            if (i != 1) {
                bundle.putInt("flags", i);
            }
            PendingIntent pendingIntent = this.mDisplayIntent;
            if (pendingIntent != null) {
                bundle.putParcelable(KEY_DISPLAY_INTENT, pendingIntent);
            }
            if (!this.mPages.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.mPages;
                bundle.putParcelableArray(KEY_PAGES, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.mBackground;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i2 = this.mContentIcon;
            if (i2 != 0) {
                bundle.putInt(KEY_CONTENT_ICON, i2);
            }
            int i3 = this.mContentIconGravity;
            if (i3 != 8388613) {
                bundle.putInt(KEY_CONTENT_ICON_GRAVITY, i3);
            }
            int i4 = this.mContentActionIndex;
            if (i4 != -1) {
                bundle.putInt(KEY_CONTENT_ACTION_INDEX, i4);
            }
            int i5 = this.mCustomSizePreset;
            if (i5 != 0) {
                bundle.putInt(KEY_CUSTOM_SIZE_PRESET, i5);
            }
            int i6 = this.mCustomContentHeight;
            if (i6 != 0) {
                bundle.putInt(KEY_CUSTOM_CONTENT_HEIGHT, i6);
            }
            int i7 = this.mGravity;
            if (i7 != 80) {
                bundle.putInt(KEY_GRAVITY, i7);
            }
            int i8 = this.mHintScreenTimeout;
            if (i8 != 0) {
                bundle.putInt(KEY_HINT_SCREEN_TIMEOUT, i8);
            }
            String str = this.mDismissalId;
            if (str != null) {
                bundle.putString(KEY_DISMISSAL_ID, str);
            }
            String str2 = this.mBridgeTag;
            if (str2 != null) {
                bundle.putString(KEY_BRIDGE_TAG, str2);
            }
            builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, bundle);
            return builder;
        }

        private static Notification.Action getActionFromActionCompat(Action action) {
            Notification.Action.Builder builder;
            Bundle bundle;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notification.Action) ipChange.ipc$dispatch("dade46a7", new Object[]{action});
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                IconCompat iconCompat = action.getIconCompat();
                builder = Api23Impl.createBuilder(iconCompat == null ? null : iconCompat.toIcon(), action.getTitle(), action.getActionIntent());
            } else {
                IconCompat iconCompat2 = action.getIconCompat();
                builder = Api20Impl.createBuilder((iconCompat2 == null || iconCompat2.getType() != 2) ? 0 : iconCompat2.getResId(), action.getTitle(), action.getActionIntent());
            }
            if (action.getExtras() != null) {
                bundle = new Bundle(action.getExtras());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean(NotificationCompatJellybean.EXTRA_ALLOW_GENERATED_REPLIES, action.getAllowGeneratedReplies());
            if (i >= 24) {
                Api24Impl.setAllowGeneratedReplies(builder, action.getAllowGeneratedReplies());
            }
            if (i >= 31) {
                Api31Impl.setAuthenticationRequired(builder, action.isAuthenticationRequired());
            }
            Api20Impl.addExtras(builder, bundle);
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                for (RemoteInput remoteInput : RemoteInput.fromCompat(remoteInputs)) {
                    Api20Impl.addRemoteInput(builder, remoteInput);
                }
            }
            return Api20Impl.build(builder);
        }

        @Deprecated
        public boolean getHintAvoidBackgroundClipping() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eed4ff33", new Object[]{this})).booleanValue();
            }
            return (this.mFlags & 16) != 0;
        }

        @Deprecated
        public boolean getHintShowBackgroundOnly() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ef4232bf", new Object[]{this})).booleanValue();
            }
            return (this.mFlags & 4) != 0;
        }

        public WearableExtender(Notification notification) {
            this.mActions = new ArrayList<>();
            this.mFlags = 1;
            this.mPages = new ArrayList<>();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
            Bundle extras = NotificationCompat.getExtras(notification);
            Bundle bundle = extras != null ? extras.getBundle(EXTRA_WEARABLE_EXTENSIONS) : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("actions");
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    Action[] actionArr = new Action[size];
                    for (int i = 0; i < size; i++) {
                        actionArr[i] = Api20Impl.getActionCompatFromAction(parcelableArrayList, i);
                    }
                    Collections.addAll(this.mActions, actionArr);
                }
                this.mFlags = bundle.getInt("flags", 1);
                this.mDisplayIntent = (PendingIntent) bundle.getParcelable(KEY_DISPLAY_INTENT);
                Notification[] notificationArrayFromBundle = NotificationCompat.getNotificationArrayFromBundle(bundle, KEY_PAGES);
                if (notificationArrayFromBundle != null) {
                    Collections.addAll(this.mPages, notificationArrayFromBundle);
                }
                this.mBackground = (Bitmap) bundle.getParcelable("background");
                this.mContentIcon = bundle.getInt(KEY_CONTENT_ICON);
                this.mContentIconGravity = bundle.getInt(KEY_CONTENT_ICON_GRAVITY, 8388613);
                this.mContentActionIndex = bundle.getInt(KEY_CONTENT_ACTION_INDEX, -1);
                this.mCustomSizePreset = bundle.getInt(KEY_CUSTOM_SIZE_PRESET, 0);
                this.mCustomContentHeight = bundle.getInt(KEY_CUSTOM_CONTENT_HEIGHT);
                this.mGravity = bundle.getInt(KEY_GRAVITY, 80);
                this.mHintScreenTimeout = bundle.getInt(KEY_HINT_SCREEN_TIMEOUT);
                this.mDismissalId = bundle.getString(KEY_DISMISSAL_ID);
                this.mBridgeTag = bundle.getString(KEY_BRIDGE_TAG);
            }
        }
    }

    public static Action getAction(Notification notification, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Action) ipChange.ipc$dispatch("191d6c16", new Object[]{notification, new Integer(i)});
        }
        return getActionCompatFromAction(notification.actions[i]);
    }

    public static Action getActionCompatFromAction(Notification.Action action) {
        RemoteInput[] remoteInputArr;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Action) ipChange.ipc$dispatch("4cdc0a7", new Object[]{action});
        }
        RemoteInput[] remoteInputs = Api20Impl.getRemoteInputs(action);
        IconCompat iconCompat = null;
        if (remoteInputs == null) {
            remoteInputArr = null;
        } else {
            RemoteInput[] remoteInputArr2 = new RemoteInput[remoteInputs.length];
            for (int i4 = 0; i4 < remoteInputs.length; i4++) {
                RemoteInput remoteInput = remoteInputs[i4];
                String resultKey = Api20Impl.getResultKey(remoteInput);
                CharSequence label = Api20Impl.getLabel(remoteInput);
                CharSequence[] choices = Api20Impl.getChoices(remoteInput);
                boolean allowFreeFormInput = Api20Impl.getAllowFreeFormInput(remoteInput);
                if (Build.VERSION.SDK_INT >= 29) {
                    i3 = Api29Impl.getEditChoicesBeforeSending(remoteInput);
                } else {
                    i3 = 0;
                }
                remoteInputArr2[i4] = new RemoteInput(resultKey, label, choices, allowFreeFormInput, i3, Api20Impl.getExtras(remoteInput), null);
            }
            remoteInputArr = remoteInputArr2;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 24) {
            z = Api20Impl.getExtras(action).getBoolean(NotificationCompatJellybean.EXTRA_ALLOW_GENERATED_REPLIES);
        } else if (Api20Impl.getExtras(action).getBoolean(NotificationCompatJellybean.EXTRA_ALLOW_GENERATED_REPLIES) || Api24Impl.getAllowGeneratedReplies(action)) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = Api20Impl.getExtras(action).getBoolean(Action.EXTRA_SHOWS_USER_INTERFACE, true);
        if (i5 >= 28) {
            i = Api28Impl.getSemanticAction(action);
        } else {
            i = Api20Impl.getExtras(action).getInt(Action.EXTRA_SEMANTIC_ACTION, 0);
        }
        if (i5 >= 29) {
            z2 = Api29Impl.isContextual(action);
        } else {
            z2 = false;
        }
        if (i5 >= 31) {
            z3 = Api31Impl.isAuthenticationRequired(action);
        } else {
            z3 = false;
        }
        if (i5 < 23) {
            return new Action(action.icon, action.title, action.actionIntent, Api20Impl.getExtras(action), remoteInputArr, (RemoteInput[]) null, z, i, z4, z2, z3);
        }
        if (Api23Impl.getIcon(action) == null && (i2 = action.icon) != 0) {
            return new Action(i2, action.title, action.actionIntent, Api20Impl.getExtras(action), remoteInputArr, (RemoteInput[]) null, z, i, z4, z2, z3);
        }
        if (Api23Impl.getIcon(action) != null) {
            iconCompat = IconCompat.createFromIconOrNullIfZeroResId(Api23Impl.getIcon(action));
        }
        return new Action(iconCompat, action.title, action.actionIntent, Api20Impl.getExtras(action), remoteInputArr, (RemoteInput[]) null, z, i, z4, z2, z3);
    }

    public static int getActionCount(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56373d33", new Object[]{notification})).intValue();
        }
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAutoCancel(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adae6200", new Object[]{notification})).booleanValue();
        }
        if ((notification.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public static int getBadgeIconType(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7d15590", new Object[]{notification})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getBadgeIconType(notification);
        }
        return 0;
    }

    public static BubbleMetadata getBubbleMetadata(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BubbleMetadata) ipChange.ipc$dispatch("8440c3a5", new Object[]{notification});
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return BubbleMetadata.fromPlatform(Api29Impl.getBubbleMetadata(notification));
        }
        return null;
    }

    public static String getCategory(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d4a9c0f", new Object[]{notification});
        }
        return notification.category;
    }

    public static String getChannelId(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("748df13b", new Object[]{notification});
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getChannelId(notification);
        }
        return null;
    }

    public static int getColor(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6cde21d", new Object[]{notification})).intValue();
        }
        return notification.color;
    }

    public static CharSequence getContentInfo(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("6cbe42ec", new Object[]{notification});
        }
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    public static CharSequence getContentText(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("69a933cd", new Object[]{notification});
        }
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    public static CharSequence getContentTitle(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("f7be6128", new Object[]{notification});
        }
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    public static Bundle getExtras(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("537e7c1a", new Object[]{notification});
        }
        return notification.extras;
    }

    public static String getGroup(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4040791a", new Object[]{notification});
        }
        return Api20Impl.getGroup(notification);
    }

    public static int getGroupAlertBehavior(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3680a7f5", new Object[]{notification})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getGroupAlertBehavior(notification);
        }
        return 0;
    }

    public static boolean getHighPriority(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6cadc1d", new Object[]{notification})).booleanValue();
        }
        if ((notification.flags & 128) != 0) {
            return true;
        }
        return false;
    }

    public static boolean getLocalOnly(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e603882", new Object[]{notification})).booleanValue();
        }
        if ((notification.flags & 256) != 0) {
            return true;
        }
        return false;
    }

    public static LocusIdCompat getLocusId(Notification notification) {
        LocusId locusId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocusIdCompat) ipChange.ipc$dispatch("842aed36", new Object[]{notification});
        }
        if (Build.VERSION.SDK_INT < 29 || (locusId = Api29Impl.getLocusId(notification)) == null) {
            return null;
        }
        return LocusIdCompat.toLocusIdCompat(locusId);
    }

    public static boolean getOngoing(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3748b5c6", new Object[]{notification})).booleanValue();
        }
        if ((notification.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean getOnlyAlertOnce(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4573bfc", new Object[]{notification})).booleanValue();
        }
        if ((notification.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    public static Notification getPublicVersion(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("5c66cd16", new Object[]{notification});
        }
        return notification.publicVersion;
    }

    public static CharSequence getSettingsText(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("ad68f37", new Object[]{notification});
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getSettingsText(notification);
        }
        return null;
    }

    public static String getShortcutId(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f84a82c", new Object[]{notification});
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getShortcutId(notification);
        }
        return null;
    }

    public static boolean getShowWhen(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5ee65ce", new Object[]{notification})).booleanValue();
        }
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    public static String getSortKey(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8959df8", new Object[]{notification});
        }
        return Api20Impl.getSortKey(notification);
    }

    public static CharSequence getSubText(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1943eee6", new Object[]{notification});
        }
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("348e2ce2", new Object[]{notification})).longValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getTimeoutAfter(notification);
        }
        return 0L;
    }

    public static boolean getUsesChronometer(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b7d5f65", new Object[]{notification})).booleanValue();
        }
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5db89638", new Object[]{notification})).intValue();
        }
        return notification.visibility;
    }

    public static boolean isGroupSummary(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac4e1bf2", new Object[]{notification})).booleanValue();
        }
        if ((notification.flags & 512) != 0) {
            return true;
        }
        return false;
    }

    public static Bitmap reduceLargeIconSize(Context context, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("1be1a67a", new Object[]{context, bitmap});
        }
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class CarExtender implements Extender {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final String EXTRA_COLOR = "app_color";
        private static final String EXTRA_CONVERSATION = "car_conversation";
        public static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final String EXTRA_LARGE_ICON = "large_icon";
        private static final String KEY_AUTHOR = "author";
        private static final String KEY_MESSAGES = "messages";
        private static final String KEY_ON_READ = "on_read";
        private static final String KEY_ON_REPLY = "on_reply";
        private static final String KEY_PARTICIPANTS = "participants";
        private static final String KEY_REMOTE_INPUT = "remote_input";
        private static final String KEY_TEXT = "text";
        private static final String KEY_TIMESTAMP = "timestamp";
        private int mColor;
        private Bitmap mLargeIcon;
        private UnreadConversation mUnreadConversation;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api20Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api20Impl() {
            }

            public static RemoteInput.Builder addExtras(RemoteInput.Builder builder, Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RemoteInput.Builder) ipChange.ipc$dispatch("c94ae2ef", new Object[]{builder, bundle});
                }
                return builder.addExtras(bundle);
            }

            public static RemoteInput build(RemoteInput.Builder builder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RemoteInput) ipChange.ipc$dispatch("970b9d7a", new Object[]{builder});
                }
                return builder.build();
            }

            public static Parcelable castToParcelable(RemoteInput remoteInput) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Parcelable) ipChange.ipc$dispatch("e6bce02a", new Object[]{remoteInput}) : remoteInput;
            }

            public static RemoteInput.Builder createBuilder(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RemoteInput.Builder) ipChange.ipc$dispatch("c13e50d4", new Object[]{str});
                }
                return new RemoteInput.Builder(str);
            }

            public static boolean getAllowFreeFormInput(RemoteInput remoteInput) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ea8e1dc1", new Object[]{remoteInput})).booleanValue();
                }
                return remoteInput.getAllowFreeFormInput();
            }

            public static CharSequence[] getChoices(RemoteInput remoteInput) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (CharSequence[]) ipChange.ipc$dispatch("6cb1e851", new Object[]{remoteInput});
                }
                return remoteInput.getChoices();
            }

            public static Bundle getExtras(RemoteInput remoteInput) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Bundle) ipChange.ipc$dispatch("8156432f", new Object[]{remoteInput});
                }
                return remoteInput.getExtras();
            }

            public static CharSequence getLabel(RemoteInput remoteInput) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (CharSequence) ipChange.ipc$dispatch("f6e3e794", new Object[]{remoteInput});
                }
                return remoteInput.getLabel();
            }

            public static String getResultKey(RemoteInput remoteInput) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("21165088", new Object[]{remoteInput});
                }
                return remoteInput.getResultKey();
            }

            public static RemoteInput.Builder setAllowFreeFormInput(RemoteInput.Builder builder, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RemoteInput.Builder) ipChange.ipc$dispatch("75e0d29e", new Object[]{builder, new Boolean(z)});
                }
                return builder.setAllowFreeFormInput(z);
            }

            public static RemoteInput.Builder setChoices(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RemoteInput.Builder) ipChange.ipc$dispatch("58805e0", new Object[]{builder, charSequenceArr});
                }
                return builder.setChoices(charSequenceArr);
            }

            public static RemoteInput.Builder setLabel(RemoteInput.Builder builder, CharSequence charSequence) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RemoteInput.Builder) ipChange.ipc$dispatch("3f28d763", new Object[]{builder, charSequence});
                }
                return builder.setLabel(charSequence);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api29Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api29Impl() {
            }

            public static int getEditChoicesBeforeSending(RemoteInput remoteInput) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("567a3ace", new Object[]{remoteInput})).intValue();
                }
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        /* compiled from: Taobao */
        @Deprecated
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class UnreadConversation {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final long mLatestTimestamp;
            private final String[] mMessages;
            private final String[] mParticipants;
            private final PendingIntent mReadPendingIntent;
            private final RemoteInput mRemoteInput;
            private final PendingIntent mReplyPendingIntent;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
            public static class Builder {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private long mLatestTimestamp;
                private final List<String> mMessages = new ArrayList();
                private final String mParticipant;
                private PendingIntent mReadPendingIntent;
                private RemoteInput mRemoteInput;
                private PendingIntent mReplyPendingIntent;

                public Builder(String str) {
                    this.mParticipant = str;
                }

                public Builder addMessage(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Builder) ipChange.ipc$dispatch("6b890df7", new Object[]{this, str});
                    }
                    if (str != null) {
                        this.mMessages.add(str);
                    }
                    return this;
                }

                public UnreadConversation build() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (UnreadConversation) ipChange.ipc$dispatch("ee957fac", new Object[]{this});
                    }
                    List<String> list = this.mMessages;
                    return new UnreadConversation((String[]) list.toArray(new String[list.size()]), this.mRemoteInput, this.mReplyPendingIntent, this.mReadPendingIntent, new String[]{this.mParticipant}, this.mLatestTimestamp);
                }

                public Builder setLatestTimestamp(long j) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Builder) ipChange.ipc$dispatch("4c122cf0", new Object[]{this, new Long(j)});
                    }
                    this.mLatestTimestamp = j;
                    return this;
                }

                public Builder setReadPendingIntent(PendingIntent pendingIntent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Builder) ipChange.ipc$dispatch("f425029a", new Object[]{this, pendingIntent});
                    }
                    this.mReadPendingIntent = pendingIntent;
                    return this;
                }

                public Builder setReplyAction(PendingIntent pendingIntent, RemoteInput remoteInput) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Builder) ipChange.ipc$dispatch("a6f644fe", new Object[]{this, pendingIntent, remoteInput});
                    }
                    this.mRemoteInput = remoteInput;
                    this.mReplyPendingIntent = pendingIntent;
                    return this;
                }
            }

            public UnreadConversation(String[] strArr, RemoteInput remoteInput, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.mMessages = strArr;
                this.mRemoteInput = remoteInput;
                this.mReadPendingIntent = pendingIntent2;
                this.mReplyPendingIntent = pendingIntent;
                this.mParticipants = strArr2;
                this.mLatestTimestamp = j;
            }

            public long getLatestTimestamp() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("82646314", new Object[]{this})).longValue();
                }
                return this.mLatestTimestamp;
            }

            public String[] getMessages() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String[]) ipChange.ipc$dispatch("9268c5d8", new Object[]{this});
                }
                return this.mMessages;
            }

            public String getParticipant() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("9603891c", new Object[]{this});
                }
                String[] strArr = this.mParticipants;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            public String[] getParticipants() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String[]) ipChange.ipc$dispatch("10f81a2c", new Object[]{this});
                }
                return this.mParticipants;
            }

            public PendingIntent getReadPendingIntent() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (PendingIntent) ipChange.ipc$dispatch("2899655a", new Object[]{this});
                }
                return this.mReadPendingIntent;
            }

            public RemoteInput getRemoteInput() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RemoteInput) ipChange.ipc$dispatch("405cbfda", new Object[]{this});
                }
                return this.mRemoteInput;
            }

            public PendingIntent getReplyPendingIntent() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (PendingIntent) ipChange.ipc$dispatch("10e68532", new Object[]{this});
                }
                return this.mReplyPendingIntent;
            }
        }

        public CarExtender() {
            this.mColor = 0;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public Builder extend(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b14c5a35", new Object[]{this, builder});
            }
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.mLargeIcon;
            if (bitmap != null) {
                bundle.putParcelable(EXTRA_LARGE_ICON, bitmap);
            }
            int i = this.mColor;
            if (i != 0) {
                bundle.putInt(EXTRA_COLOR, i);
            }
            UnreadConversation unreadConversation = this.mUnreadConversation;
            if (unreadConversation != null) {
                bundle.putBundle(EXTRA_CONVERSATION, getBundleForUnreadConversation(unreadConversation));
            }
            builder.getExtras().putBundle(EXTRA_CAR_EXTENDER, bundle);
            return builder;
        }

        public int getColor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("756dbba7", new Object[]{this})).intValue();
            }
            return this.mColor;
        }

        public Bitmap getLargeIcon() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("6c36bd03", new Object[]{this});
            }
            return this.mLargeIcon;
        }

        @Deprecated
        public UnreadConversation getUnreadConversation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UnreadConversation) ipChange.ipc$dispatch("f10ce706", new Object[]{this});
            }
            return this.mUnreadConversation;
        }

        public CarExtender setColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CarExtender) ipChange.ipc$dispatch("432e1aae", new Object[]{this, new Integer(i)});
            }
            this.mColor = i;
            return this;
        }

        public CarExtender setLargeIcon(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CarExtender) ipChange.ipc$dispatch("7d2b9914", new Object[]{this, bitmap});
            }
            this.mLargeIcon = bitmap;
            return this;
        }

        @Deprecated
        public CarExtender setUnreadConversation(UnreadConversation unreadConversation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CarExtender) ipChange.ipc$dispatch("f4c33f5d", new Object[]{this, unreadConversation});
            }
            this.mUnreadConversation = unreadConversation;
            return this;
        }

        public CarExtender(Notification notification) {
            this.mColor = 0;
            Bundle bundle = NotificationCompat.getExtras(notification) == null ? null : NotificationCompat.getExtras(notification).getBundle(EXTRA_CAR_EXTENDER);
            if (bundle != null) {
                this.mLargeIcon = (Bitmap) bundle.getParcelable(EXTRA_LARGE_ICON);
                this.mColor = bundle.getInt(EXTRA_COLOR, 0);
                this.mUnreadConversation = getUnreadConversationFromBundle(bundle.getBundle(EXTRA_CONVERSATION));
            }
        }

        private static Bundle getBundleForUnreadConversation(UnreadConversation unreadConversation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("23c197a1", new Object[]{unreadConversation});
            }
            Bundle bundle = new Bundle();
            String str = (unreadConversation.getParticipants() == null || unreadConversation.getParticipants().length <= 1) ? null : unreadConversation.getParticipants()[0];
            int length = unreadConversation.getMessages().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i = 0; i < length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", unreadConversation.getMessages()[i]);
                bundle2.putString(KEY_AUTHOR, str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray(KEY_MESSAGES, parcelableArr);
            RemoteInput remoteInput = unreadConversation.getRemoteInput();
            if (remoteInput != null) {
                RemoteInput.Builder createBuilder = Api20Impl.createBuilder(remoteInput.getResultKey());
                Api20Impl.setLabel(createBuilder, remoteInput.getLabel());
                Api20Impl.setChoices(createBuilder, remoteInput.getChoices());
                Api20Impl.setAllowFreeFormInput(createBuilder, remoteInput.getAllowFreeFormInput());
                Api20Impl.addExtras(createBuilder, remoteInput.getExtras());
                bundle.putParcelable(KEY_REMOTE_INPUT, Api20Impl.castToParcelable(Api20Impl.build(createBuilder)));
            }
            bundle.putParcelable(KEY_ON_REPLY, unreadConversation.getReplyPendingIntent());
            bundle.putParcelable(KEY_ON_READ, unreadConversation.getReadPendingIntent());
            bundle.putStringArray(KEY_PARTICIPANTS, unreadConversation.getParticipants());
            bundle.putLong("timestamp", unreadConversation.getLatestTimestamp());
            return bundle;
        }

        private static UnreadConversation getUnreadConversationFromBundle(Bundle bundle) {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UnreadConversation) ipChange.ipc$dispatch("63a49570", new Object[]{bundle});
            }
            RemoteInput remoteInput = null;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_MESSAGES);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    Parcelable parcelable = parcelableArray[i];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i] = string;
                        if (string != null) {
                        }
                    }
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(KEY_ON_READ);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(KEY_ON_REPLY);
            RemoteInput remoteInput2 = (RemoteInput) bundle.getParcelable(KEY_REMOTE_INPUT);
            String[] stringArray = bundle.getStringArray(KEY_PARTICIPANTS);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput2 != null) {
                remoteInput = new RemoteInput(Api20Impl.getResultKey(remoteInput2), Api20Impl.getLabel(remoteInput2), Api20Impl.getChoices(remoteInput2), Api20Impl.getAllowFreeFormInput(remoteInput2), Build.VERSION.SDK_INT >= 29 ? Api29Impl.getEditChoicesBeforeSending(remoteInput2) : 0, Api20Impl.getExtras(remoteInput2), null);
            }
            return new UnreadConversation(strArr, remoteInput, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class InboxStyle extends Style {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
        private ArrayList<CharSequence> mTexts = new ArrayList<>();

        public InboxStyle() {
        }

        public static /* synthetic */ Object ipc$super(InboxStyle inboxStyle, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -354564456) {
                super.clearCompatExtraKeys((Bundle) objArr[0]);
                return null;
            } else if (hashCode == 1225057360) {
                super.restoreFromCompatExtras((Bundle) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/core/app/NotificationCompat$InboxStyle");
            }
        }

        public InboxStyle addLine(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InboxStyle) ipChange.ipc$dispatch("7e175c7", new Object[]{this, charSequence});
            }
            if (charSequence != null) {
                this.mTexts.add(Builder.limitCharSequenceLength(charSequence));
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bce7500", new Object[]{this, notificationBuilderWithBuilderAccessor});
                return;
            }
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            Iterator<CharSequence> it = this.mTexts.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void clearCompatExtraKeys(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eaddc698", new Object[]{this, bundle});
                return;
            }
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_TEXT_LINES);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public String getClassName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
            }
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void restoreFromCompatExtras(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4904e450", new Object[]{this, bundle});
                return;
            }
            super.restoreFromCompatExtras(bundle);
            this.mTexts.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                Collections.addAll(this.mTexts, bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
            }
        }

        public InboxStyle setBigContentTitle(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InboxStyle) ipChange.ipc$dispatch("5adf634f", new Object[]{this, charSequence});
            }
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public InboxStyle setSummaryText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InboxStyle) ipChange.ipc$dispatch("1b14efc3", new Object[]{this, charSequence});
            }
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public InboxStyle(Builder builder) {
            setBuilder(builder);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class TvExtender implements Extender {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String EXTRA_CHANNEL_ID = "channel_id";
        public static final String EXTRA_CONTENT_INTENT = "content_intent";
        public static final String EXTRA_DELETE_INTENT = "delete_intent";
        private static final String EXTRA_FLAGS = "flags";
        public static final String EXTRA_SUPPRESS_SHOW_OVER_APPS = "suppressShowOverApps";
        public static final String EXTRA_TV_EXTENDER = "android.tv.EXTENSIONS";
        private static final int FLAG_AVAILABLE_ON_TV = 1;
        private static final String TAG = "TvExtender";
        private String mChannelId;
        private PendingIntent mContentIntent;
        private PendingIntent mDeleteIntent;
        private int mFlags;
        private boolean mSuppressShowOverApps;

        public TvExtender() {
            this.mFlags = 1;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public Builder extend(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b14c5a35", new Object[]{this, builder});
            }
            if (Build.VERSION.SDK_INT < 26) {
                return builder;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("flags", this.mFlags);
            bundle.putString(EXTRA_CHANNEL_ID, this.mChannelId);
            bundle.putBoolean(EXTRA_SUPPRESS_SHOW_OVER_APPS, this.mSuppressShowOverApps);
            PendingIntent pendingIntent = this.mContentIntent;
            if (pendingIntent != null) {
                bundle.putParcelable(EXTRA_CONTENT_INTENT, pendingIntent);
            }
            PendingIntent pendingIntent2 = this.mDeleteIntent;
            if (pendingIntent2 != null) {
                bundle.putParcelable(EXTRA_DELETE_INTENT, pendingIntent2);
            }
            builder.getExtras().putBundle(EXTRA_TV_EXTENDER, bundle);
            return builder;
        }

        public String getChannelId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this});
            }
            return this.mChannelId;
        }

        public PendingIntent getContentIntent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PendingIntent) ipChange.ipc$dispatch("4a574fb2", new Object[]{this});
            }
            return this.mContentIntent;
        }

        public PendingIntent getDeleteIntent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PendingIntent) ipChange.ipc$dispatch("8eb43110", new Object[]{this});
            }
            return this.mDeleteIntent;
        }

        public boolean isAvailableOnTv() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("43575aab", new Object[]{this})).booleanValue();
            }
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean isSuppressShowOverApps() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("172fa2ad", new Object[]{this})).booleanValue();
            }
            return this.mSuppressShowOverApps;
        }

        public TvExtender setChannelId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TvExtender) ipChange.ipc$dispatch("74340e56", new Object[]{this, str});
            }
            this.mChannelId = str;
            return this;
        }

        public TvExtender setContentIntent(PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TvExtender) ipChange.ipc$dispatch("ed12c98b", new Object[]{this, pendingIntent});
            }
            this.mContentIntent = pendingIntent;
            return this;
        }

        public TvExtender setDeleteIntent(PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TvExtender) ipChange.ipc$dispatch("8d3a7055", new Object[]{this, pendingIntent});
            }
            this.mDeleteIntent = pendingIntent;
            return this;
        }

        public TvExtender setSuppressShowOverApps(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TvExtender) ipChange.ipc$dispatch("1064869c", new Object[]{this, new Boolean(z)});
            }
            this.mSuppressShowOverApps = z;
            return this;
        }

        public TvExtender(Notification notification) {
            if (Build.VERSION.SDK_INT >= 26) {
                Bundle bundle = notification.extras;
                Bundle bundle2 = bundle == null ? null : bundle.getBundle(EXTRA_TV_EXTENDER);
                if (bundle2 != null) {
                    this.mFlags = bundle2.getInt("flags");
                    this.mChannelId = bundle2.getString(EXTRA_CHANNEL_ID);
                    this.mSuppressShowOverApps = bundle2.getBoolean(EXTRA_SUPPRESS_SHOW_OVER_APPS);
                    this.mContentIntent = (PendingIntent) bundle2.getParcelable(EXTRA_CONTENT_INTENT);
                    this.mDeleteIntent = (PendingIntent) bundle2.getParcelable(EXTRA_DELETE_INTENT);
                }
            }
        }
    }

    public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2cedae0", new Object[]{notification})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getAllowSystemGeneratedContextualActions(notification);
        }
        return false;
    }

    public static List<Action> getInvisibleActions(Notification notification) {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f02ded24", new Object[]{notification});
        }
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle(CarExtender.EXTRA_CAR_EXTENDER);
        if (!(bundle2 == null || (bundle = bundle2.getBundle(CarExtender.EXTRA_INVISIBLE_ACTIONS)) == null)) {
            for (int i = 0; i < bundle.size(); i++) {
                arrayList.add(NotificationCompatJellybean.getActionFromBundle(bundle.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    public static Notification[] getNotificationArrayFromBundle(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification[]) ipChange.ipc$dispatch("f83ef84e", new Object[]{bundle, str});
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static List<Person> getPeople(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f8d37605", new Object[]{notification});
        }
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Person.fromAndroidPerson(x8k.a(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (!(stringArray == null || stringArray.length == 0)) {
                for (String str : stringArray) {
                    arrayList.add(new Person.Builder().setUri(str).build());
                }
            }
        }
        return arrayList;
    }
}
