package com.taobao.appbundle.remote;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LoadConfig implements Parcelable {
    public static final Parcelable.Creator<LoadConfig> CREATOR = new a();
    private String bizLine;
    private String bizScene;
    private Intent failIntent;
    private String failToastText;
    private boolean isActivityAnimFromBottom;
    private boolean isTitleEnable;
    private boolean isToastEnable;
    private int logoResId;
    private Intent successIntent;
    private String successToastText;
    private String title;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Parcelable.Creator<LoadConfig> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public LoadConfig createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoadConfig) ipChange.ipc$dispatch("3baf471c", new Object[]{this, parcel});
            }
            return new LoadConfig(parcel);
        }

        /* renamed from: b */
        public LoadConfig[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoadConfig[]) ipChange.ipc$dispatch("4c3a5505", new Object[]{this, new Integer(i)});
            }
            return new LoadConfig[i];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Intent f10055a;
        public String b;
        public final boolean c = true;

        static {
            t2o.a(377487402);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3558e3a3", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b7a39882", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a0eb1d0", new Object[]{bVar})).booleanValue();
            }
            return bVar.c;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("39ee4d61", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ int e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("17217e53", new Object[]{bVar})).intValue();
            }
            bVar.getClass();
            return 0;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3e83b71f", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c0ce6bfe", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ Intent h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("57670790", new Object[]{bVar});
            }
            return bVar.f10055a;
        }

        public static /* synthetic */ Intent i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("7068592f", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ boolean j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e5c728a9", new Object[]{bVar})).booleanValue();
            }
            bVar.getClass();
            return false;
        }

        public static /* synthetic */ boolean k(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f1b7dea", new Object[]{bVar})).booleanValue();
            }
            bVar.getClass();
            return false;
        }

        public LoadConfig l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoadConfig) ipChange.ipc$dispatch("68b41a1e", new Object[]{this});
            }
            return new LoadConfig(this, null);
        }

        public b m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b1dbd030", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b n(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4cacd91c", new Object[]{this, intent});
            }
            this.f10055a = intent;
            return this;
        }
    }

    static {
        t2o.a(377487400);
    }

    public /* synthetic */ LoadConfig(b bVar, a aVar) {
        this(bVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBizLine() {
        return this.bizLine;
    }

    public String getBizScene() {
        return this.bizScene;
    }

    public Intent getFailIntent() {
        return this.failIntent;
    }

    public String getFailToastText() {
        return this.failToastText;
    }

    public int getLogoResId() {
        return this.logoResId;
    }

    public Intent getSuccessIntent() {
        return this.successIntent;
    }

    public String getSuccessToastText() {
        return this.successToastText;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isActivityAnimFromBottom() {
        return this.isActivityAnimFromBottom;
    }

    public boolean isTitleEnable() {
        return this.isTitleEnable;
    }

    public boolean isToastEnable() {
        return this.isToastEnable;
    }

    public String toString() {
        return "LoadConfig{bizLine='" + this.bizLine + "'bizScene='" + this.bizScene + "', title='" + this.title + "', logoResId=" + this.logoResId + ", successToastText='" + this.successToastText + "', failToastText='" + this.failToastText + "', isTitleEnable=" + this.isTitleEnable + ", isActivityAnimFromBottom=" + this.isActivityAnimFromBottom + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bizLine);
        parcel.writeString(this.bizScene);
        parcel.writeString(this.title);
        parcel.writeInt(this.logoResId);
        parcel.writeString(this.successToastText);
        parcel.writeString(this.failToastText);
        parcel.writeParcelable(this.successIntent, i);
        parcel.writeParcelable(this.failIntent, i);
        parcel.writeByte(this.isTitleEnable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isActivityAnimFromBottom ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isToastEnable ? (byte) 1 : (byte) 0);
    }

    public LoadConfig(Parcel parcel) {
        this.bizLine = parcel.readString();
        this.bizScene = parcel.readString();
        this.title = parcel.readString();
        this.logoResId = parcel.readInt();
        this.successToastText = parcel.readString();
        this.failToastText = parcel.readString();
        this.successIntent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.failIntent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        boolean z = false;
        this.isTitleEnable = parcel.readByte() != 0;
        this.isActivityAnimFromBottom = parcel.readByte() != 0;
        this.isToastEnable = parcel.readByte() != 0 ? true : z;
    }

    private LoadConfig(b bVar) {
        this.bizLine = b.a(bVar);
        this.bizScene = b.b(bVar);
        this.title = b.d(bVar);
        this.logoResId = b.e(bVar);
        this.successToastText = b.f(bVar);
        this.failToastText = b.g(bVar);
        this.failIntent = b.h(bVar);
        this.successIntent = b.i(bVar);
        this.isActivityAnimFromBottom = b.j(bVar);
        this.isTitleEnable = b.k(bVar);
        this.isToastEnable = b.c(bVar);
    }
}
