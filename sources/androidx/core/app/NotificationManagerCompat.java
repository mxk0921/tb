package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.u8k;
import tb.v8k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class NotificationManagerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    public static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static String sEnabledNotificationListeners;
    private static SideChannelManager sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static List<StatusBarNotification> getActiveNotifications(NotificationManager notificationManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("ac1fd3cd", new Object[]{notificationManager});
            }
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            if (activeNotifications == null) {
                return new ArrayList();
            }
            return Arrays.asList(activeNotifications);
        }

        public static int getCurrentInterruptionFilter(NotificationManager notificationManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3df2e2b9", new Object[]{notificationManager})).intValue();
            }
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static boolean areNotificationsEnabled(NotificationManager notificationManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4f2227d", new Object[]{notificationManager})).booleanValue();
            }
            return notificationManager.areNotificationsEnabled();
        }

        public static int getImportance(NotificationManager notificationManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5837a7cf", new Object[]{notificationManager})).intValue();
            }
            return notificationManager.getImportance();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static void createNotificationChannel(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e13994d", new Object[]{notificationManager, notificationChannel});
            } else {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }

        public static void createNotificationChannelGroup(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f6045d", new Object[]{notificationManager, notificationChannelGroup});
            } else {
                notificationManager.createNotificationChannelGroup(notificationChannelGroup);
            }
        }

        public static void createNotificationChannelGroups(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5a3f307", new Object[]{notificationManager, list});
            } else {
                notificationManager.createNotificationChannelGroups(list);
            }
        }

        public static void createNotificationChannels(NotificationManager notificationManager, List<NotificationChannel> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a851860", new Object[]{notificationManager, list});
            } else {
                notificationManager.createNotificationChannels(list);
            }
        }

        public static void deleteNotificationChannel(NotificationManager notificationManager, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("952e1bc3", new Object[]{notificationManager, str});
            } else {
                notificationManager.deleteNotificationChannel(str);
            }
        }

        public static void deleteNotificationChannelGroup(NotificationManager notificationManager, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9e4b77e", new Object[]{notificationManager, str});
            } else {
                notificationManager.deleteNotificationChannelGroup(str);
            }
        }

        public static String getId(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87e50c01", new Object[]{notificationChannel}) : notificationChannel.getId();
        }

        public static NotificationChannel getNotificationChannel(NotificationManager notificationManager, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NotificationChannel) ipChange.ipc$dispatch("deabac35", new Object[]{notificationManager, str});
            }
            return notificationManager.getNotificationChannel(str);
        }

        public static List<NotificationChannelGroup> getNotificationChannelGroups(NotificationManager notificationManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("38bdd557", new Object[]{notificationManager});
            }
            return notificationManager.getNotificationChannelGroups();
        }

        public static List<NotificationChannel> getNotificationChannels(NotificationManager notificationManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("d1d5c152", new Object[]{notificationManager});
            }
            return notificationManager.getNotificationChannels();
        }

        public static String getId(NotificationChannelGroup notificationChannelGroup) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99a5c2e", new Object[]{notificationChannelGroup}) : notificationChannelGroup.getId();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static NotificationChannelGroup getNotificationChannelGroup(NotificationManager notificationManager, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NotificationChannelGroup) ipChange.ipc$dispatch("b9a4a65d", new Object[]{notificationManager, str});
            }
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api30Impl() {
        }

        public static NotificationChannel getNotificationChannel(NotificationManager notificationManager, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NotificationChannel) ipChange.ipc$dispatch("a39cde7f", new Object[]{notificationManager, str, str2});
            }
            return notificationManager.getNotificationChannel(str, str2);
        }

        public static String getParentChannelId(NotificationChannel notificationChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f2a466ee", new Object[]{notificationChannel});
            }
            return notificationChannel.getParentChannelId();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api34Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api34Impl() {
        }

        public static boolean canUseFullScreenIntent(NotificationManager notificationManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("98304bc", new Object[]{notificationManager})).booleanValue();
            }
            return notificationManager.canUseFullScreenIntent();
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface InterruptionFilter {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class NotifyTask implements Task {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int id;
        public final Notification notif;
        public final String packageName;
        public final String tag;

        public NotifyTask(String str, int i, String str2, Notification notification) {
            this.packageName = str;
            this.id = i;
            this.tag = str2;
            this.notif = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24105ebb", new Object[]{this, iNotificationSideChannel});
            } else {
                iNotificationSideChannel.notify(this.packageName, this.id, this.tag, this.notif);
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "NotifyTask[packageName:" + this.packageName + ", id:" + this.id + ", tag:" + this.tag + "]";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ServiceConnectedEvent {
        public final ComponentName componentName;
        public final IBinder iBinder;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.componentName = componentName;
            this.iBinder = iBinder;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class SideChannelManager implements Handler.Callback, ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int MSG_QUEUE_TASK = 0;
        private static final int MSG_RETRY_LISTENER_QUEUE = 3;
        private static final int MSG_SERVICE_CONNECTED = 1;
        private static final int MSG_SERVICE_DISCONNECTED = 2;
        private final Context mContext;
        private final Handler mHandler;
        private final HandlerThread mHandlerThread;
        private final Map<ComponentName, ListenerRecord> mRecordMap = new HashMap();
        private Set<String> mCachedEnabledPackages = new HashSet();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class ListenerRecord {
            public final ComponentName componentName;
            public INotificationSideChannel service;
            public boolean bound = false;
            public ArrayDeque<Task> taskQueue = new ArrayDeque<>();
            public int retryCount = 0;

            public ListenerRecord(ComponentName componentName) {
                this.componentName = componentName;
            }
        }

        public SideChannelManager(Context context) {
            this.mContext = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper(), this);
        }

        private boolean ensureServiceBound(ListenerRecord listenerRecord) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9679a2a7", new Object[]{this, listenerRecord})).booleanValue();
            }
            if (listenerRecord.bound) {
                return true;
            }
            boolean bindService = this.mContext.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(listenerRecord.componentName), this, 33);
            listenerRecord.bound = bindService;
            if (bindService) {
                listenerRecord.retryCount = 0;
            } else {
                new StringBuilder("Unable to bind to listener ").append(listenerRecord.componentName);
                this.mContext.unbindService(this);
            }
            return listenerRecord.bound;
        }

        private void handleQueueTask(Task task) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1eb2bb07", new Object[]{this, task});
                return;
            }
            updateListenerMap();
            for (ListenerRecord listenerRecord : this.mRecordMap.values()) {
                listenerRecord.taskQueue.add(task);
                processListenerQueue(listenerRecord);
            }
        }

        private void handleRetryListenerQueue(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52384cab", new Object[]{this, componentName});
                return;
            }
            ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12752dd3", new Object[]{this, componentName, iBinder});
                return;
            }
            ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                listenerRecord.service = INotificationSideChannel.Stub.asInterface(iBinder);
                listenerRecord.retryCount = 0;
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4d5a1c0", new Object[]{this, componentName});
                return;
            }
            ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                ensureServiceUnbound(listenerRecord);
            }
        }

        private void processListenerQueue(ListenerRecord listenerRecord) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a37dc", new Object[]{this, listenerRecord});
                return;
            }
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                StringBuilder sb = new StringBuilder("Processing component ");
                sb.append(listenerRecord.componentName);
                sb.append(", ");
                sb.append(listenerRecord.taskQueue.size());
                sb.append(" queued tasks");
            }
            if (!listenerRecord.taskQueue.isEmpty()) {
                if (!ensureServiceBound(listenerRecord) || listenerRecord.service == null) {
                    scheduleListenerRetry(listenerRecord);
                    return;
                }
                while (true) {
                    Task peek = listenerRecord.taskQueue.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Sending task ");
                            sb2.append(peek);
                        }
                        peek.send(listenerRecord.service);
                        listenerRecord.taskQueue.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            new StringBuilder("Remote service has died: ").append(listenerRecord.componentName);
                        }
                    } catch (RemoteException unused2) {
                        new StringBuilder("RemoteException communicating with ").append(listenerRecord.componentName);
                    }
                }
                if (!listenerRecord.taskQueue.isEmpty()) {
                    scheduleListenerRetry(listenerRecord);
                }
            }
        }

        private void scheduleListenerRetry(ListenerRecord listenerRecord) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bfecd0d", new Object[]{this, listenerRecord});
            } else if (!this.mHandler.hasMessages(3, listenerRecord.componentName)) {
                int i = listenerRecord.retryCount;
                int i2 = i + 1;
                listenerRecord.retryCount = i2;
                if (i2 > 6) {
                    StringBuilder sb = new StringBuilder("Giving up on delivering ");
                    sb.append(listenerRecord.taskQueue.size());
                    sb.append(" tasks to ");
                    sb.append(listenerRecord.componentName);
                    sb.append(" after ");
                    sb.append(listenerRecord.retryCount);
                    sb.append(" retries");
                    listenerRecord.taskQueue.clear();
                    return;
                }
                int i3 = (1 << i) * 1000;
                if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                    StringBuilder sb2 = new StringBuilder("Scheduling retry for ");
                    sb2.append(i3);
                    sb2.append(" ms");
                }
                this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(3, listenerRecord.componentName), i3);
            }
        }

        private void updateListenerMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("749ab086", new Object[]{this});
                return;
            }
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.mContext);
            if (!enabledListenerPackages.equals(this.mCachedEnabledPackages)) {
                this.mCachedEnabledPackages = enabledListenerPackages;
                List<ResolveInfo> queryIntentServices = this.mContext.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
                HashSet hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            StringBuilder sb = new StringBuilder("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.mRecordMap.containsKey(componentName2)) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            new StringBuilder("Adding listener record for ").append(componentName2);
                        }
                        this.mRecordMap.put(componentName2, new ListenerRecord(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, ListenerRecord>> it2 = this.mRecordMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<ComponentName, ListenerRecord> next = it2.next();
                    if (!hashSet.contains(next.getKey())) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            new StringBuilder("Removing listener record for ").append(next.getKey());
                        }
                        ensureServiceUnbound(next.getValue());
                        it2.remove();
                    }
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            int i = message.what;
            if (i == 0) {
                handleQueueTask((Task) message.obj);
                return true;
            } else if (i == 1) {
                ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                handleServiceConnected(serviceConnectedEvent.componentName, serviceConnectedEvent.iBinder);
                return true;
            } else if (i == 2) {
                handleServiceDisconnected((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                handleRetryListenerQueue((ComponentName) message.obj);
                return true;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                new StringBuilder("Connected to service ").append(componentName);
            }
            this.mHandler.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                new StringBuilder("Disconnected from service ").append(componentName);
            }
            this.mHandler.obtainMessage(2, componentName).sendToTarget();
        }

        public void queueTask(Task task) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b112d64f", new Object[]{this, task});
            } else {
                this.mHandler.obtainMessage(0, task).sendToTarget();
            }
        }

        private void ensureServiceUnbound(ListenerRecord listenerRecord) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6255c7c", new Object[]{this, listenerRecord});
                return;
            }
            if (listenerRecord.bound) {
                this.mContext.unbindService(this);
                listenerRecord.bound = false;
            }
            listenerRecord.service = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface Task {
        void send(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    public static NotificationManagerCompat from(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationManagerCompat) ipChange.ipc$dispatch("94585e9c", new Object[]{context});
        }
        return new NotificationManagerCompat(context);
    }

    private void pushSideChannelQueue(Task task) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e754ef58", new Object[]{this, task});
            return;
        }
        synchronized (sLock) {
            try {
                if (sSideChannelManager == null) {
                    sSideChannelManager = new SideChannelManager(this.mContext.getApplicationContext());
                }
                sSideChannelManager.queueTask(task);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba043af0", new Object[]{notification})).booleanValue();
        }
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras == null || !extras.getBoolean(EXTRA_USE_SIDE_CHANNEL)) {
            return false;
        }
        return true;
    }

    public void cancel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7d4d22", new Object[]{this, new Integer(i)});
        } else {
            cancel(null, i);
        }
    }

    public void cancelAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186d51ce", new Object[]{this});
        } else {
            this.mNotificationManager.cancelAll();
        }
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a032d74", new Object[]{this, notificationChannel});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.createNotificationChannel(this.mNotificationManager, notificationChannel);
        }
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3322a04", new Object[]{this, notificationChannelGroup});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.createNotificationChannelGroup(this.mNotificationManager, notificationChannelGroup);
        }
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d24f68", new Object[]{this, list});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.createNotificationChannelGroups(this.mNotificationManager, list);
        }
    }

    public void createNotificationChannelGroupsCompat(List<NotificationChannelGroupCompat> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b47960a", new Object[]{this, list});
        } else if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (NotificationChannelGroupCompat notificationChannelGroupCompat : list) {
                arrayList.add(notificationChannelGroupCompat.getNotificationChannelGroup());
            }
            Api26Impl.createNotificationChannelGroups(this.mNotificationManager, arrayList);
        }
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99276ef", new Object[]{this, list});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.createNotificationChannels(this.mNotificationManager, list);
        }
    }

    public void createNotificationChannelsCompat(List<NotificationChannelCompat> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8977bc51", new Object[]{this, list});
        } else if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (NotificationChannelCompat notificationChannelCompat : list) {
                arrayList.add(notificationChannelCompat.getNotificationChannel());
            }
            Api26Impl.createNotificationChannels(this.mNotificationManager, arrayList);
        }
    }

    public void deleteNotificationChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10f6cbe", new Object[]{this, str});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.deleteNotificationChannel(this.mNotificationManager, str);
        }
    }

    public void deleteNotificationChannelGroup(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ddc1a3", new Object[]{this, str});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.deleteNotificationChannelGroup(this.mNotificationManager, str);
        }
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c70bd4", new Object[]{this, collection});
        } else if (Build.VERSION.SDK_INT >= 26) {
            for (NotificationChannel notificationChannel : Api26Impl.getNotificationChannels(this.mNotificationManager)) {
                NotificationChannel a2 = u8k.a(notificationChannel);
                if (!collection.contains(Api26Impl.getId(a2)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(Api30Impl.getParentChannelId(a2)))) {
                    Api26Impl.deleteNotificationChannel(this.mNotificationManager, Api26Impl.getId(a2));
                }
            }
        }
    }

    public List<StatusBarNotification> getActiveNotifications() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("20feb714", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getActiveNotifications(this.mNotificationManager);
        }
        return new ArrayList();
    }

    public int getImportance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cac5d1e4", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getImportance(this.mNotificationManager);
        }
        return -1000;
    }

    public NotificationChannel getNotificationChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return u8k.a(ipChange.ipc$dispatch("882fe3fa", new Object[]{this, str}));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getNotificationChannel(this.mNotificationManager, str);
        }
        return null;
    }

    public NotificationChannelCompat getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationChannelCompat) ipChange.ipc$dispatch("cfa159e4", new Object[]{this, str});
        }
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new NotificationChannelCompat(notificationChannel);
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return v8k.a(ipChange.ipc$dispatch("fcde9da2", new Object[]{this, str}));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Api28Impl.getNotificationChannelGroup(this.mNotificationManager, str);
        }
        if (i >= 26) {
            for (NotificationChannelGroup notificationChannelGroup : getNotificationChannelGroups()) {
                NotificationChannelGroup a2 = v8k.a(notificationChannelGroup);
                if (Api26Impl.getId(a2).equals(str)) {
                    return a2;
                }
            }
        }
        return null;
    }

    public NotificationChannelGroupCompat getNotificationChannelGroupCompat(String str) {
        NotificationChannelGroup notificationChannelGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationChannelGroupCompat) ipChange.ipc$dispatch("bbab3474", new Object[]{this, str});
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new NotificationChannelGroupCompat(notificationChannelGroup2);
            }
            return null;
        } else if (i < 26 || (notificationChannelGroup = getNotificationChannelGroup(str)) == null) {
            return null;
        } else {
            return new NotificationChannelGroupCompat(notificationChannelGroup, getNotificationChannels());
        }
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bae7b44a", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getNotificationChannelGroups(this.mNotificationManager);
        }
        return Collections.emptyList();
    }

    public List<NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
        List<NotificationChannel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c137a5e8", new Object[]{this});
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                if (i >= 28) {
                    list = Collections.emptyList();
                } else {
                    list = getNotificationChannels();
                }
                ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
                for (NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
                    NotificationChannelGroup a2 = v8k.a(notificationChannelGroup);
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new NotificationChannelGroupCompat(a2));
                    } else {
                        arrayList.add(new NotificationChannelGroupCompat(a2, list));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public List<NotificationChannel> getNotificationChannels() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7a58b0ef", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getNotificationChannels(this.mNotificationManager);
        }
        return Collections.emptyList();
    }

    public List<NotificationChannelCompat> getNotificationChannelsCompat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e75fd2cd", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                ArrayList arrayList = new ArrayList(notificationChannels.size());
                for (NotificationChannel notificationChannel : notificationChannels) {
                    arrayList.add(new NotificationChannelCompat(u8k.a(notificationChannel)));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public void notify(int i, Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b38a369", new Object[]{this, new Integer(i), notification});
        } else {
            notify(null, i, notification);
        }
    }

    public void cancel(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3cb2d8", new Object[]{this, str, new Integer(i)});
        } else {
            this.mNotificationManager.cancel(str, i);
        }
    }

    public int getCurrentInterruptionFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f26769ba", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        return Api23Impl.getCurrentInterruptionFilter(this.mNotificationManager);
    }

    public void notify(String str, int i, Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f695f5f", new Object[]{this, str, new Integer(i), notification});
        } else if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new NotifyTask(this.mContext.getPackageName(), i, str, notification));
            this.mNotificationManager.cancel(str, i);
        } else {
            this.mNotificationManager.notify(str, i, notification);
        }
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("5bdf70e4", new Object[]{context});
        }
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                try {
                    if (!string.equals(sEnabledNotificationListeners)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        sEnabledNotificationListenerPackages = hashSet;
                        sEnabledNotificationListeners = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    public boolean canUseFullScreenIntent() {
        int checkSelfPermission;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e94f999", new Object[]{this})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            return true;
        }
        if (i >= 34) {
            return Api34Impl.canUseFullScreenIntent(this.mNotificationManager);
        }
        checkSelfPermission = this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT");
        return checkSelfPermission == 0;
    }

    public void createNotificationChannel(NotificationChannelCompat notificationChannelCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b949d83c", new Object[]{this, notificationChannelCompat});
        } else {
            createNotificationChannel(notificationChannelCompat.getNotificationChannel());
        }
    }

    public void createNotificationChannelGroup(NotificationChannelGroupCompat notificationChannelGroupCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d8c78", new Object[]{this, notificationChannelGroupCompat});
        } else {
            createNotificationChannelGroup(notificationChannelGroupCompat.getNotificationChannelGroup());
        }
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return u8k.a(ipChange.ipc$dispatch("533e8f04", new Object[]{this, str, str2}));
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getNotificationChannel(this.mNotificationManager, str, str2);
        }
        return getNotificationChannel(str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class NotificationWithIdAndTag {
        public final int mId;
        public Notification mNotification;
        public final String mTag;

        public NotificationWithIdAndTag(String str, int i, Notification notification) {
            this.mTag = str;
            this.mId = i;
            this.mNotification = notification;
        }

        public NotificationWithIdAndTag(int i, Notification notification) {
            this(null, i, notification);
        }
    }

    public NotificationManagerCompat(NotificationManager notificationManager, Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    public NotificationChannelCompat getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationChannelCompat) ipChange.ipc$dispatch("6ac2616e", new Object[]{this, str, str2});
        }
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new NotificationChannelCompat(notificationChannel);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CancelTask implements Task {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final boolean all;
        public final int id;
        public final String packageName;
        public final String tag;

        public CancelTask(String str) {
            this.packageName = str;
            this.id = 0;
            this.tag = null;
            this.all = true;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24105ebb", new Object[]{this, iNotificationSideChannel});
            } else if (this.all) {
                iNotificationSideChannel.cancelAll(this.packageName);
            } else {
                iNotificationSideChannel.cancel(this.packageName, this.id, this.tag);
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "CancelTask[packageName:" + this.packageName + ", id:" + this.id + ", tag:" + this.tag + ", all:" + this.all + "]";
        }

        public CancelTask(String str, int i, String str2) {
            this.packageName = str;
            this.id = i;
            this.tag = str2;
            this.all = false;
        }
    }

    public boolean areNotificationsEnabled() {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.areNotificationsEnabled(this.mNotificationManager);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.mContext.getSystemService("appops");
        ApplicationInfo applicationInfo = this.mContext.getApplicationInfo();
        String packageName = this.mContext.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod(CHECK_OP_NO_THROW, cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField(OP_POST_NOTIFICATION).get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void notify(List<NotificationWithIdAndTag> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a043c41", new Object[]{this, list});
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            NotificationWithIdAndTag notificationWithIdAndTag = list.get(i);
            notify(notificationWithIdAndTag.mTag, notificationWithIdAndTag.mId, notificationWithIdAndTag.mNotification);
        }
    }
}
