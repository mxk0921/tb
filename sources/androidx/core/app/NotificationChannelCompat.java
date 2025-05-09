package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import tb.u8k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NotificationChannelCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CHANNEL_ID = "miscellaneous";
    private static final int DEFAULT_LIGHT_COLOR = 0;
    private static final boolean DEFAULT_SHOW_BADGE = true;
    public AudioAttributes mAudioAttributes;
    private boolean mBypassDnd;
    private boolean mCanBubble;
    public String mConversationId;
    public String mDescription;
    public String mGroupId;
    public final String mId;
    public int mImportance;
    private boolean mImportantConversation;
    public int mLightColor;
    public boolean mLights;
    private int mLockscreenVisibility;
    public CharSequence mName;
    public String mParentId;
    public boolean mShowBadge;
    public Uri mSound;
    public boolean mVibrationEnabled;
    public long[] mVibrationPattern;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static boolean canBypassDnd(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6b841712", new Object[]{notificationChannel})).booleanValue();
            }
            return notificationChannel.canBypassDnd();
        }

        public static boolean canShowBadge(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e0e273fe", new Object[]{notificationChannel})).booleanValue();
            }
            return notificationChannel.canShowBadge();
        }

        public static NotificationChannel createNotificationChannel(String str, CharSequence charSequence, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NotificationChannel) ipChange.ipc$dispatch("11249379", new Object[]{str, charSequence, new Integer(i)});
            }
            return new NotificationChannel(str, charSequence, i);
        }

        public static void enableLights(NotificationChannel notificationChannel, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfe65764", new Object[]{notificationChannel, new Boolean(z)});
            } else {
                notificationChannel.enableLights(z);
            }
        }

        public static void enableVibration(NotificationChannel notificationChannel, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("892422f3", new Object[]{notificationChannel, new Boolean(z)});
            } else {
                notificationChannel.enableVibration(z);
            }
        }

        public static AudioAttributes getAudioAttributes(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AudioAttributes) ipChange.ipc$dispatch("66a1d808", new Object[]{notificationChannel});
            }
            return notificationChannel.getAudioAttributes();
        }

        public static String getDescription(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ffcc1f6", new Object[]{notificationChannel});
            }
            return notificationChannel.getDescription();
        }

        public static String getGroup(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f1db13b9", new Object[]{notificationChannel});
            }
            return notificationChannel.getGroup();
        }

        public static String getId(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("87e50c01", new Object[]{notificationChannel});
            }
            return notificationChannel.getId();
        }

        public static int getImportance(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("506932b9", new Object[]{notificationChannel})).intValue();
            }
            return notificationChannel.getImportance();
        }

        public static int getLightColor(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c6c36ce0", new Object[]{notificationChannel})).intValue();
            }
            return notificationChannel.getLightColor();
        }

        public static int getLockscreenVisibility(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b9c38204", new Object[]{notificationChannel})).intValue();
            }
            return notificationChannel.getLockscreenVisibility();
        }

        public static CharSequence getName(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("a0e5324b", new Object[]{notificationChannel});
            }
            return notificationChannel.getName();
        }

        public static Uri getSound(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("58f28a6e", new Object[]{notificationChannel});
            }
            return notificationChannel.getSound();
        }

        public static long[] getVibrationPattern(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (long[]) ipChange.ipc$dispatch("3c5a5509", new Object[]{notificationChannel});
            }
            return notificationChannel.getVibrationPattern();
        }

        public static void setDescription(NotificationChannel notificationChannel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e42ec140", new Object[]{notificationChannel, str});
            } else {
                notificationChannel.setDescription(str);
            }
        }

        public static void setGroup(NotificationChannel notificationChannel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("590220dd", new Object[]{notificationChannel, str});
            } else {
                notificationChannel.setGroup(str);
            }
        }

        public static void setLightColor(NotificationChannel notificationChannel, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c3008c2", new Object[]{notificationChannel, new Integer(i)});
            } else {
                notificationChannel.setLightColor(i);
            }
        }

        public static void setShowBadge(NotificationChannel notificationChannel, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aeed5348", new Object[]{notificationChannel, new Boolean(z)});
            } else {
                notificationChannel.setShowBadge(z);
            }
        }

        public static void setSound(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd07e5fb", new Object[]{notificationChannel, uri, audioAttributes});
            } else {
                notificationChannel.setSound(uri, audioAttributes);
            }
        }

        public static void setVibrationPattern(NotificationChannel notificationChannel, long[] jArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea23d89f", new Object[]{notificationChannel, jArr});
            } else {
                notificationChannel.setVibrationPattern(jArr);
            }
        }

        public static boolean shouldShowLights(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4a3c9d87", new Object[]{notificationChannel})).booleanValue();
            }
            return notificationChannel.shouldShowLights();
        }

        public static boolean shouldVibrate(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fafa838", new Object[]{notificationChannel})).booleanValue();
            }
            return notificationChannel.shouldVibrate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static boolean canBubble(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("169603f8", new Object[]{notificationChannel})).booleanValue();
            }
            return notificationChannel.canBubble();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api30Impl() {
        }

        public static String getConversationId(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("740ca6a4", new Object[]{notificationChannel});
            }
            return notificationChannel.getConversationId();
        }

        public static String getParentChannelId(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f2a466ee", new Object[]{notificationChannel});
            }
            return notificationChannel.getParentChannelId();
        }

        public static boolean isImportantConversation(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("35649d19", new Object[]{notificationChannel})).booleanValue();
            }
            return notificationChannel.isImportantConversation();
        }

        public static void setConversationId(NotificationChannel notificationChannel, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8530e204", new Object[]{notificationChannel, str, str2});
            } else {
                notificationChannel.setConversationId(str, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final NotificationChannelCompat mChannel;

        public Builder(String str, int i) {
            this.mChannel = new NotificationChannelCompat(str, i);
        }

        public NotificationChannelCompat build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NotificationChannelCompat) ipChange.ipc$dispatch("bdcb45c4", new Object[]{this});
            }
            return this.mChannel;
        }

        public Builder setConversationId(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8b99edf3", new Object[]{this, str, str2});
            }
            if (Build.VERSION.SDK_INT >= 30) {
                NotificationChannelCompat notificationChannelCompat = this.mChannel;
                notificationChannelCompat.mParentId = str;
                notificationChannelCompat.mConversationId = str2;
            }
            return this;
        }

        public Builder setDescription(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("311f1f23", new Object[]{this, str});
            }
            this.mChannel.mDescription = str;
            return this;
        }

        public Builder setGroup(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a39d866", new Object[]{this, str});
            }
            this.mChannel.mGroupId = str;
            return this;
        }

        public Builder setImportance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("47db7efe", new Object[]{this, new Integer(i)});
            }
            this.mChannel.mImportance = i;
            return this;
        }

        public Builder setLightColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a0221fa5", new Object[]{this, new Integer(i)});
            }
            this.mChannel.mLightColor = i;
            return this;
        }

        public Builder setLightsEnabled(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("16b0e523", new Object[]{this, new Boolean(z)});
            }
            this.mChannel.mLights = z;
            return this;
        }

        public Builder setName(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a7cbca10", new Object[]{this, charSequence});
            }
            this.mChannel.mName = charSequence;
            return this;
        }

        public Builder setShowBadge(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8ab1021", new Object[]{this, new Boolean(z)});
            }
            this.mChannel.mShowBadge = z;
            return this;
        }

        public Builder setSound(Uri uri, AudioAttributes audioAttributes) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("bbba51e4", new Object[]{this, uri, audioAttributes});
            }
            NotificationChannelCompat notificationChannelCompat = this.mChannel;
            notificationChannelCompat.mSound = uri;
            notificationChannelCompat.mAudioAttributes = audioAttributes;
            return this;
        }

        public Builder setVibrationEnabled(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c62f3c54", new Object[]{this, new Boolean(z)});
            }
            this.mChannel.mVibrationEnabled = z;
            return this;
        }

        public Builder setVibrationPattern(long[] jArr) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6517bd0e", new Object[]{this, jArr});
            }
            NotificationChannelCompat notificationChannelCompat = this.mChannel;
            if (jArr == null || jArr.length <= 0) {
                z = false;
            }
            notificationChannelCompat.mVibrationEnabled = z;
            notificationChannelCompat.mVibrationPattern = jArr;
            return this;
        }
    }

    public NotificationChannelCompat(String str, int i) {
        this.mShowBadge = true;
        this.mSound = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.mLightColor = 0;
        this.mId = (String) Preconditions.checkNotNull(str);
        this.mImportance = i;
        this.mAudioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean canBubble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1bbeb07", new Object[]{this})).booleanValue();
        }
        return this.mCanBubble;
    }

    public boolean canBypassDnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cd224ad", new Object[]{this})).booleanValue();
        }
        return this.mBypassDnd;
    }

    public boolean canShowBadge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc19ca41", new Object[]{this})).booleanValue();
        }
        return this.mShowBadge;
    }

    public AudioAttributes getAudioAttributes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioAttributes) ipChange.ipc$dispatch("248e2c2d", new Object[]{this});
        }
        return this.mAudioAttributes;
    }

    public String getConversationId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5849185", new Object[]{this});
        }
        return this.mConversationId;
    }

    public String getDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9cffbf3", new Object[]{this});
        }
        return this.mDescription;
    }

    public String getGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba4599d0", new Object[]{this});
        }
        return this.mGroupId;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.mId;
    }

    public int getImportance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cac5d1e4", new Object[]{this})).intValue();
        }
        return this.mImportance;
    }

    public int getLightColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40025add", new Object[]{this})).intValue();
        }
        return this.mLightColor;
    }

    public int getLockscreenVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64698139", new Object[]{this})).intValue();
        }
        return this.mLockscreenVisibility;
    }

    public CharSequence getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("c519bfb2", new Object[]{this});
        }
        return this.mName;
    }

    public NotificationChannel getNotificationChannel() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return u8k.a(ipChange.ipc$dispatch("b23daa70", new Object[]{this}));
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannel createNotificationChannel = Api26Impl.createNotificationChannel(this.mId, this.mName, this.mImportance);
        Api26Impl.setDescription(createNotificationChannel, this.mDescription);
        Api26Impl.setGroup(createNotificationChannel, this.mGroupId);
        Api26Impl.setShowBadge(createNotificationChannel, this.mShowBadge);
        Api26Impl.setSound(createNotificationChannel, this.mSound, this.mAudioAttributes);
        Api26Impl.enableLights(createNotificationChannel, this.mLights);
        Api26Impl.setLightColor(createNotificationChannel, this.mLightColor);
        Api26Impl.setVibrationPattern(createNotificationChannel, this.mVibrationPattern);
        Api26Impl.enableVibration(createNotificationChannel, this.mVibrationEnabled);
        if (!(i < 30 || (str = this.mParentId) == null || (str2 = this.mConversationId) == null)) {
            Api30Impl.setConversationId(createNotificationChannel, str, str2);
        }
        return createNotificationChannel;
    }

    public String getParentChannelId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9d5f7fb", new Object[]{this});
        }
        return this.mParentId;
    }

    public Uri getSound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("2629a897", new Object[]{this});
        }
        return this.mSound;
    }

    public long[] getVibrationPattern() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("27cba9aa", new Object[]{this});
        }
        return this.mVibrationPattern;
    }

    public boolean isImportantConversation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6887e5c6", new Object[]{this})).booleanValue();
        }
        return this.mImportantConversation;
    }

    public boolean shouldShowLights() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee2e798", new Object[]{this})).booleanValue();
        }
        return this.mLights;
    }

    public boolean shouldVibrate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2fbbec7", new Object[]{this})).booleanValue();
        }
        return this.mVibrationEnabled;
    }

    public Builder toBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Builder) ipChange.ipc$dispatch("6b0af4ff", new Object[]{this});
        }
        return new Builder(this.mId, this.mImportance).setName(this.mName).setDescription(this.mDescription).setGroup(this.mGroupId).setShowBadge(this.mShowBadge).setSound(this.mSound, this.mAudioAttributes).setLightsEnabled(this.mLights).setLightColor(this.mLightColor).setVibrationEnabled(this.mVibrationEnabled).setVibrationPattern(this.mVibrationPattern).setConversationId(this.mParentId, this.mConversationId);
    }

    public NotificationChannelCompat(NotificationChannel notificationChannel) {
        this(Api26Impl.getId(notificationChannel), Api26Impl.getImportance(notificationChannel));
        this.mName = Api26Impl.getName(notificationChannel);
        this.mDescription = Api26Impl.getDescription(notificationChannel);
        this.mGroupId = Api26Impl.getGroup(notificationChannel);
        this.mShowBadge = Api26Impl.canShowBadge(notificationChannel);
        this.mSound = Api26Impl.getSound(notificationChannel);
        this.mAudioAttributes = Api26Impl.getAudioAttributes(notificationChannel);
        this.mLights = Api26Impl.shouldShowLights(notificationChannel);
        this.mLightColor = Api26Impl.getLightColor(notificationChannel);
        this.mVibrationEnabled = Api26Impl.shouldVibrate(notificationChannel);
        this.mVibrationPattern = Api26Impl.getVibrationPattern(notificationChannel);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.mParentId = Api30Impl.getParentChannelId(notificationChannel);
            this.mConversationId = Api30Impl.getConversationId(notificationChannel);
        }
        this.mBypassDnd = Api26Impl.canBypassDnd(notificationChannel);
        this.mLockscreenVisibility = Api26Impl.getLockscreenVisibility(notificationChannel);
        if (i >= 29) {
            this.mCanBubble = Api29Impl.canBubble(notificationChannel);
        }
        if (i >= 30) {
            this.mImportantConversation = Api30Impl.isImportantConversation(notificationChannel);
        }
    }
}
