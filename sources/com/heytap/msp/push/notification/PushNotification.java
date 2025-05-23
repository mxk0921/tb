package com.heytap.msp.push.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PushNotification {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Builder extends Notification.Builder {
        private int autoDelete;
        private Icon icon;
        private int iconLevel;
        private int iconRes;
        private int importantLevel;
        private String messageId;
        private String statisticData;

        static {
            t2o.a(612368454);
        }

        public Builder(Context context, String str) {
            super(context, str);
        }

        public Builder addExtraAutoDelete(int i) {
            this.autoDelete = i;
            return this;
        }

        public Builder addExtraImportanceLevel(int i) {
            this.importantLevel = i;
            return this;
        }

        public Builder addExtraMessageId(String str) {
            this.messageId = str;
            return this;
        }

        public Builder addExtraStatisticData(String str) {
            this.statisticData = str;
            return this;
        }

        public int getAutoDelete() {
            return this.autoDelete;
        }

        public Icon getIcon() {
            return this.icon;
        }

        public int getIconLevel() {
            return this.iconLevel;
        }

        public int getIconRes() {
            return this.iconRes;
        }

        public int getImportantLevel() {
            return this.importantLevel;
        }

        public String getMessageId() {
            return this.messageId;
        }

        public String getStatisticData() {
            return this.statisticData;
        }

        public Builder(Context context) {
            super(context);
        }

        @Override // android.app.Notification.Builder
        public Builder addExtras(Bundle bundle) {
            super.addExtras(bundle);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder extend(Notification.Extender extender) {
            super.extend(extender);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setActions(Notification.Action... actionArr) {
            super.setActions(actionArr);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setAllowSystemGeneratedContextualActions(boolean z) {
            super.setAllowSystemGeneratedContextualActions(z);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setAutoCancel(boolean z) {
            super.setAutoCancel(z);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setBadgeIconType(int i) {
            super.setBadgeIconType(i);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setBubbleMetadata(Notification.BubbleMetadata bubbleMetadata) {
            super.setBubbleMetadata(bubbleMetadata);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setCategory(String str) {
            super.setCategory(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setChannelId(String str) {
            super.setChannelId(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setChronometerCountDown(boolean z) {
            super.setChronometerCountDown(z);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setColor(int i) {
            super.setColor(i);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setColorized(boolean z) {
            super.setColorized(z);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setContent(RemoteViews remoteViews) {
            super.setContent(remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setContentInfo(CharSequence charSequence) {
            super.setContentInfo(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setContentIntent(PendingIntent pendingIntent) {
            super.setContentIntent(pendingIntent);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setContentText(CharSequence charSequence) {
            super.setContentText(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setContentTitle(CharSequence charSequence) {
            super.setContentTitle(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setCustomBigContentView(RemoteViews remoteViews) {
            super.setCustomBigContentView(remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setCustomContentView(RemoteViews remoteViews) {
            super.setCustomContentView(remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setCustomHeadsUpContentView(RemoteViews remoteViews) {
            super.setCustomHeadsUpContentView(remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setDefaults(int i) {
            super.setDefaults(i);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setDeleteIntent(PendingIntent pendingIntent) {
            super.setDeleteIntent(pendingIntent);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setExtras(Bundle bundle) {
            super.setExtras(bundle);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setFullScreenIntent(PendingIntent pendingIntent, boolean z) {
            super.setFullScreenIntent(pendingIntent, z);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setGroup(String str) {
            super.setGroup(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setGroupAlertBehavior(int i) {
            super.setGroupAlertBehavior(i);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setGroupSummary(boolean z) {
            super.setGroupSummary(z);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setLights(int i, int i2, int i3) {
            super.setLights(i, i2, i3);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setLocalOnly(boolean z) {
            super.setLocalOnly(z);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setLocusId(LocusId locusId) {
            super.setLocusId(locusId);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setNumber(int i) {
            super.setNumber(i);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setOngoing(boolean z) {
            super.setOngoing(z);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setOnlyAlertOnce(boolean z) {
            super.setOnlyAlertOnce(z);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setPriority(int i) {
            super.setPriority(i);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setProgress(int i, int i2, boolean z) {
            super.setProgress(i, i2, z);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setPublicVersion(Notification notification) {
            super.setPublicVersion(notification);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setRemoteInputHistory(CharSequence[] charSequenceArr) {
            super.setRemoteInputHistory(charSequenceArr);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSettingsText(CharSequence charSequence) {
            super.setSettingsText(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setShortcutId(String str) {
            super.setShortcutId(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setShowWhen(boolean z) {
            super.setShowWhen(z);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSortKey(String str) {
            super.setSortKey(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setStyle(Notification.Style style) {
            super.setStyle(style);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSubText(CharSequence charSequence) {
            super.setSubText(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setTimeoutAfter(long j) {
            super.setTimeoutAfter(j);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setUsesChronometer(boolean z) {
            super.setUsesChronometer(z);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setVibrate(long[] jArr) {
            super.setVibrate(jArr);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setVisibility(int i) {
            super.setVisibility(i);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setWhen(long j) {
            super.setWhen(j);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            super.addAction(i, charSequence, pendingIntent);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder addPerson(String str) {
            super.addPerson(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setLargeIcon(Bitmap bitmap) {
            super.setLargeIcon(bitmap);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setTicker(CharSequence charSequence) {
            super.setTicker(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder addAction(Notification.Action action) {
            super.addAction(action);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder addPerson(Person person) {
            super.addPerson(person);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setLargeIcon(Icon icon) {
            super.setLargeIcon(icon);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSmallIcon(int i) {
            super.setSmallIcon(i);
            this.iconRes = i;
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setSound(Uri uri) {
            super.setSound(uri);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setTicker(CharSequence charSequence, RemoteViews remoteViews) {
            super.setTicker(charSequence, remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setSound(Uri uri, int i) {
            super.setSound(uri, i);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSmallIcon(int i, int i2) {
            super.setSmallIcon(i, i2);
            this.iconRes = i;
            this.iconLevel = i2;
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setSound(Uri uri, AudioAttributes audioAttributes) {
            super.setSound(uri, audioAttributes);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSmallIcon(Icon icon) {
            super.setSmallIcon(icon);
            this.icon = icon;
            return this;
        }
    }

    static {
        t2o.a(612368453);
    }
}
