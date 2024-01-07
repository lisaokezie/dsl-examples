# dsl-examples

## Patient DSL
DSL for creating patients with the following attributes
- name
- insuranceType
- insuranceNumber
- email (optional)
- phoneNumber (optional)

## Example

```
patient Max insuranceType private insuranceNumber 1234

patient Martina insuranceType compulsory insuranceNumber 000 email martina@example.de phoneNumber "+49123456"
``````