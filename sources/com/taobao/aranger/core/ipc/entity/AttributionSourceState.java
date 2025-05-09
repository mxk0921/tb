package com.taobao.aranger.core.ipc.entity;

import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AttributionSourceState {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Parcelable.Creator<AttributionSourceState> CREATOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Parcelable.Creator<AttributionSourceState> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public AttributionSourceState createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AttributionSourceState) ipChange.ipc$dispatch("de88479c", new Object[]{this, parcel});
            }
            AttributionSourceState attributionSourceState = new AttributionSourceState();
            attributionSourceState.readFromParcel(parcel);
            return attributionSourceState;
        }

        /* renamed from: b */
        public AttributionSourceState[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AttributionSourceState[]) ipChange.ipc$dispatch("3e4c3713", new Object[]{this, new Integer(i)});
            }
            return new AttributionSourceState[i];
        }
    }

    static {
        t2o.a(393216053);
    }

    private static void readFromParcelTar12(Parcel parcel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51f1fe9", new Object[]{parcel});
            return;
        }
        int dataPosition = parcel.dataPosition();
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            try {
                if (parcel.dataPosition() - dataPosition < readInt) {
                    parcel.readInt();
                    if (parcel.dataPosition() - dataPosition < readInt) {
                        parcel.readInt();
                        if (parcel.dataPosition() - dataPosition < readInt) {
                            parcel.readString();
                            if (parcel.dataPosition() - dataPosition < readInt) {
                                parcel.readString();
                                if (parcel.dataPosition() - dataPosition < readInt) {
                                    parcel.readStrongBinder();
                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                        parcel.createStringArray();
                                        if (parcel.dataPosition() - dataPosition < readInt) {
                                            parcel.createTypedArray(CREATOR);
                                            if (dataPosition <= Integer.MAX_VALUE - readInt) {
                                                parcel.setDataPosition(dataPosition + readInt);
                                                return;
                                            }
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                                            parcel.setDataPosition(dataPosition + readInt);
                                        } else {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                                        parcel.setDataPosition(dataPosition + readInt);
                                    } else {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                                    parcel.setDataPosition(dataPosition + readInt);
                                } else {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                                parcel.setDataPosition(dataPosition + readInt);
                            } else {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                            parcel.setDataPosition(dataPosition + readInt);
                        } else {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                        parcel.setDataPosition(dataPosition + readInt);
                    } else {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                    parcel.setDataPosition(dataPosition + readInt);
                } else {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
            } catch (Throwable th) {
                if (dataPosition > Integer.MAX_VALUE - readInt) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(dataPosition + readInt);
                throw th;
            }
        } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
            parcel.setDataPosition(dataPosition + readInt);
        } else {
            throw new BadParcelableException("Overflow in the size of parcelable");
        }
    }

    private static void readFromParcelTar15(Parcel parcel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b923cc86", new Object[]{parcel});
            return;
        }
        int dataPosition = parcel.dataPosition();
        int readInt = parcel.readInt();
        if (readInt >= 4) {
            try {
                if (parcel.dataPosition() - dataPosition < readInt) {
                    parcel.readInt();
                    if (parcel.dataPosition() - dataPosition < readInt) {
                        parcel.readInt();
                        if (parcel.dataPosition() - dataPosition < readInt) {
                            parcel.readInt();
                            if (parcel.dataPosition() - dataPosition < readInt) {
                                parcel.readString();
                                if (parcel.dataPosition() - dataPosition < readInt) {
                                    parcel.readString();
                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                        parcel.readStrongBinder();
                                        if (parcel.dataPosition() - dataPosition < readInt) {
                                            parcel.createStringArray();
                                            if (parcel.dataPosition() - dataPosition < readInt) {
                                                parcel.createTypedArray(CREATOR);
                                                if (dataPosition <= Integer.MAX_VALUE - readInt) {
                                                    parcel.setDataPosition(dataPosition + readInt);
                                                    return;
                                                }
                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                            } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                                                parcel.setDataPosition(dataPosition + readInt);
                                            } else {
                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                            }
                                        } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                                            parcel.setDataPosition(dataPosition + readInt);
                                        } else {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                                        parcel.setDataPosition(dataPosition + readInt);
                                    } else {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                                    parcel.setDataPosition(dataPosition + readInt);
                                } else {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                                parcel.setDataPosition(dataPosition + readInt);
                            } else {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                            parcel.setDataPosition(dataPosition + readInt);
                        } else {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                        parcel.setDataPosition(dataPosition + readInt);
                    } else {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
                    parcel.setDataPosition(dataPosition + readInt);
                } else {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
            } catch (Throwable th) {
                if (dataPosition > Integer.MAX_VALUE - readInt) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(dataPosition + readInt);
                throw th;
            }
        } else if (dataPosition <= Integer.MAX_VALUE - readInt) {
            parcel.setDataPosition(dataPosition + readInt);
        } else {
            throw new BadParcelableException("Overflow in the size of parcelable");
        }
    }

    public final void readFromParcel(Parcel parcel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa5835d", new Object[]{this, parcel});
        } else if (Build.VERSION.SDK_INT >= 35) {
            readFromParcelTar15(parcel);
        } else {
            readFromParcelTar12(parcel);
        }
    }
}
