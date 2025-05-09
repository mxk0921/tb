package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.u8k;
import tb.v8k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NotificationChannelGroupCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mBlocked;
    private List<NotificationChannelCompat> mChannels;
    public String mDescription;
    public final String mId;
    public CharSequence mName;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static NotificationChannelGroup createNotificationChannelGroup(String str, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NotificationChannelGroup) ipChange.ipc$dispatch("5354ec18", new Object[]{str, charSequence});
            }
            return new NotificationChannelGroup(str, charSequence);
        }

        public static List<NotificationChannel> getChannels(NotificationChannelGroup notificationChannelGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("78bc08c0", new Object[]{notificationChannelGroup});
            }
            return notificationChannelGroup.getChannels();
        }

        public static String getGroup(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f1db13b9", new Object[]{notificationChannel});
            }
            return notificationChannel.getGroup();
        }

        public static String getId(NotificationChannelGroup notificationChannelGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("99a5c2e", new Object[]{notificationChannelGroup});
            }
            return notificationChannelGroup.getId();
        }

        public static CharSequence getName(NotificationChannelGroup notificationChannelGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("153de2d8", new Object[]{notificationChannelGroup});
            }
            return notificationChannelGroup.getName();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static String getDescription(NotificationChannelGroup notificationChannelGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("771f1759", new Object[]{notificationChannelGroup});
            }
            return notificationChannelGroup.getDescription();
        }

        public static boolean isBlocked(NotificationChannelGroup notificationChannelGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cce6abc7", new Object[]{notificationChannelGroup})).booleanValue();
            }
            return notificationChannelGroup.isBlocked();
        }

        public static void setDescription(NotificationChannelGroup notificationChannelGroup, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ed00ba5", new Object[]{notificationChannelGroup, str});
            } else {
                notificationChannelGroup.setDescription(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final NotificationChannelGroupCompat mGroup;

        public Builder(String str) {
            this.mGroup = new NotificationChannelGroupCompat(str);
        }

        public NotificationChannelGroupCompat build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NotificationChannelGroupCompat) ipChange.ipc$dispatch("365c1f8f", new Object[]{this});
            }
            return this.mGroup;
        }

        public Builder setDescription(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b3d5a702", new Object[]{this, str});
            }
            this.mGroup.mDescription = str;
            return this;
        }

        public Builder setName(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("34efc835", new Object[]{this, charSequence});
            }
            this.mGroup.mName = charSequence;
            return this;
        }
    }

    public NotificationChannelGroupCompat(String str) {
        this.mChannels = Collections.emptyList();
        this.mId = (String) Preconditions.checkNotNull(str);
    }

    private List<NotificationChannelCompat> getChannelsCompat(List<NotificationChannel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("132bc267", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : list) {
            NotificationChannel a2 = u8k.a(notificationChannel);
            if (this.mId.equals(Api26Impl.getGroup(a2))) {
                arrayList.add(new NotificationChannelCompat(a2));
            }
        }
        return arrayList;
    }

    public List<NotificationChannelCompat> getChannels() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c0a06bda", new Object[]{this});
        }
        return this.mChannels;
    }

    public String getDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9cffbf3", new Object[]{this});
        }
        return this.mDescription;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.mId;
    }

    public CharSequence getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("c519bfb2", new Object[]{this});
        }
        return this.mName;
    }

    public NotificationChannelGroup getNotificationChannelGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return v8k.a(ipChange.ipc$dispatch("7f5a682c", new Object[]{this}));
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannelGroup createNotificationChannelGroup = Api26Impl.createNotificationChannelGroup(this.mId, this.mName);
        if (i >= 28) {
            Api28Impl.setDescription(createNotificationChannelGroup, this.mDescription);
        }
        return createNotificationChannelGroup;
    }

    public boolean isBlocked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe682ced", new Object[]{this})).booleanValue();
        }
        return this.mBlocked;
    }

    public Builder toBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Builder) ipChange.ipc$dispatch("e4711aa6", new Object[]{this});
        }
        return new Builder(this.mId).setName(this.mName).setDescription(this.mDescription);
    }

    public NotificationChannelGroupCompat(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    public NotificationChannelGroupCompat(NotificationChannelGroup notificationChannelGroup, List<NotificationChannel> list) {
        this(Api26Impl.getId(notificationChannelGroup));
        this.mName = Api26Impl.getName(notificationChannelGroup);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.mDescription = Api28Impl.getDescription(notificationChannelGroup);
        }
        if (i >= 28) {
            this.mBlocked = Api28Impl.isBlocked(notificationChannelGroup);
            this.mChannels = getChannelsCompat(Api26Impl.getChannels(notificationChannelGroup));
            return;
        }
        this.mChannels = getChannelsCompat(list);
    }
}
