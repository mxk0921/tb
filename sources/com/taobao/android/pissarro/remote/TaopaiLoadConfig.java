package com.taobao.android.pissarro.remote;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TaopaiLoadConfig implements Parcelable {
    public static final Parcelable.Creator<TaopaiLoadConfig> CREATOR = new a();
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
    public static class a implements Parcelable.Creator<TaopaiLoadConfig> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public TaopaiLoadConfig createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaopaiLoadConfig) ipChange.ipc$dispatch("6a00f936", new Object[]{this, parcel});
            }
            return new TaopaiLoadConfig(parcel);
        }

        /* renamed from: b */
        public TaopaiLoadConfig[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaopaiLoadConfig[]) ipChange.ipc$dispatch("a96f8ded", new Object[]{this, new Integer(i)});
            }
            return new TaopaiLoadConfig[i];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9176a;
        public Intent b;
        public String c;
        public String d;
        public boolean e;
        public boolean f = false;
        public boolean g = true;

        static {
            t2o.a(623902799);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d01e897f", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("880af700", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6772676", new Object[]{bVar})).booleanValue();
            }
            return bVar.g;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3ff76481", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ int e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e7886a51", new Object[]{bVar})).intValue();
            }
            bVar.getClass();
            return 0;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("afd03f83", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("67bcad04", new Object[]{bVar});
            }
            return bVar.f9176a;
        }

        public static /* synthetic */ Intent h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("f36f2338", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ Intent i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("b999abf9", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ boolean j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f5ae583d", new Object[]{bVar})).booleanValue();
            }
            return bVar.f;
        }

        public static /* synthetic */ boolean k(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("921c549c", new Object[]{bVar})).booleanValue();
            }
            return bVar.e;
        }

        public TaopaiLoadConfig l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaopaiLoadConfig) ipChange.ipc$dispatch("14669974", new Object[]{this});
            }
            return new TaopaiLoadConfig(this, null);
        }

        public b m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5f0b3fc0", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public b n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a5de3dd1", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public b o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4c7cef3e", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public b p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("32df2abe", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ada44614", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("390c98c0", new Object[]{this, str});
            }
            this.f9176a = str;
            return this;
        }

        public b s(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9bfec789", new Object[]{this, intent});
            }
            this.b = intent;
            return this;
        }
    }

    static {
        t2o.a(623902797);
    }

    public /* synthetic */ TaopaiLoadConfig(b bVar, a aVar) {
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
        return "TaopaiLoadConfig{bizLine='" + this.bizLine + "'bizScene='" + this.bizScene + "', title='" + this.title + "', logoResId=" + this.logoResId + ", successToastText='" + this.successToastText + "', failToastText='" + this.failToastText + "', isTitleEnable=" + this.isTitleEnable + ", isActivityAnimFromBottom=" + this.isActivityAnimFromBottom + '}';
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

    public TaopaiLoadConfig(Parcel parcel) {
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

    private TaopaiLoadConfig(b bVar) {
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
