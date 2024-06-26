package za.ac.cput.domain;

import java.util.Objects;

public class Address {

    private String addressId;
    private String userId;
    private int streetNumber;
    private String streetName;
    private String suburb;
    private int postalCode;

    private Address() {}

    private Address(Builder builder) {
        this.addressId = builder.addressId;
        this.userId = builder.userId;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.postalCode = builder.postalCode;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getUserId() {
        return userId;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getSuburb() {
        return suburb;
    }

    public int getPostalCode() {
        return postalCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Address address = (Address) obj;
        return streetNumber == address.streetNumber &&
                postalCode == address.postalCode &&
                Objects.equals(addressId, address.addressId) &&
                Objects.equals(userId, address.userId) &&
                Objects.equals(streetName, address.streetName) &&
                Objects.equals(suburb, address.suburb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, userId, streetNumber, streetName, suburb, postalCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", userId='" + userId + '\'' +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }

    public static class Builder {
        private String addressId;
        private String userId;
        private int streetNumber;
        private String streetName;
        private String suburb;
        private int postalCode;

        public Builder setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setStreetNumber(int streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setPostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder copy(Address address) {
            this.addressId = address.addressId;
            this.userId = address.userId;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.suburb = address.suburb;
            this.postalCode = address.postalCode;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
